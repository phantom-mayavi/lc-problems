import java.util.ArrayList;
import java.util.List;

public class KthFactorOfN_1492 {

    public static void main(String[] args) {
        System.out.println(new KthFactorOfN_1492().kthFactor(4, 3));
        System.out.println(new KthFactorOfN_1492().kthFactor2(4, 3));
    }

    public int kthFactor(int n, int k) {
        int currFactor = 0;
        for (int i= 1; i <= n; i++) {
            if (n % i ==0 ) {
                if (++currFactor == k) {
                    return i;
                }
            }
        }

        return -1;
    }

    public int kthFactor2(int n, int k) {
        List<Integer> factors = new ArrayList<>(), revFactors = new ArrayList<>();
        for(int factor = 1; factor * factor <= n; factor++){
            if(n % factor == 0){
                factors.add(factor);
                if(n/factor != factor) // To avoid duplicate(edge case)
                    revFactors.add(n/factor);
            }
        }
        if(factors.size() + revFactors.size() < k) // Case 1
            return -1;
        if(factors.size() >= k) // Case 2
            return factors.get(k - 1);
        k -= factors.size();
        return revFactors.get(revFactors.size() - k); // Case 3
    }
}
