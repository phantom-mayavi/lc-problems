import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Intersection_Mul_Arrays_2248 {

    public static void main(String[] args) {
//        int[][] nums = {
//                {3,1,2,4,5},
//                {1,2,3,4},
//                {3,4,5,6}
//        };
        int[][] nums = {
                {7,34,45,10,12,27,13},
                {27,21,45,10,12,13}
        };
        System.out.println(intersection2(nums));
    }
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> integerList = new ArrayList<>();
        Map<Integer, Integer> numCountInArray = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (numCountInArray.containsKey(nums[i][j])) {
                    numCountInArray.put(nums[i][j], numCountInArray.get(nums[i][j]) + 1);
                } else {
                    numCountInArray.put(nums[i][j], 1);
                }
            }
        }
        integerList = numCountInArray.entrySet().stream().filter(entry -> entry.getValue().equals(nums.length))
                .map(entry -> entry.getKey())
                .sorted()
                .collect(Collectors.toList());

        return integerList;

    }

    public static List<Integer> intersection2(int[][] nums) {
        int ROW = nums.length;
        int M = 1001;
        int[] freq = new int[M];
        for(int i=0; i<ROW; i++) {
            for(int j=0; j<nums[i].length; j++) {
                int num = nums[i][j];
                freq[num]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums[0].length; i++) {
            if(freq[nums[0][i]] == ROW) {
                ans.add(nums[0][i]);
            }
        }
        return ans.stream().sorted().collect(Collectors.toList());

    }

}
