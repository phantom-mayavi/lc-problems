import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class DefuseBmb_1652 {
    public static void main(String[] args) {
        int[] code = new int[]{5, 7, 1, 4};
        code = new DefuseBmb_1652().decrypt(code, 3);
        Arrays.stream(code).sequential().forEach(System.out::println);

        code = new int[]{2,4,9,3};
        code = new DefuseBmb_1652().decrypt(code, -2);
        Arrays.stream(code).sequential().forEach(System.out::println);
    }

    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if (k == 0) {
            return ans;
        }

        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % code.length];
                }
                ans[i] = sum;
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= -1 * k; j++) {
                    sum += code[(i - j + code.length) % code.length];
                }
                ans[i] = sum;
            }
        }

        return ans;
    }
}
