import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Small_No_From_2_Digit_arrays_2605 {
    public static void main(String[] args) {
        Small_No_From_2_Digit_arrays_2605 myObj = new Small_No_From_2_Digit_arrays_2605();
        int[] nums1 = {4,1,3}, nums2 = {5,7};
//        Input: nums1 = [4,1,3], nums2 = [5,7]
        System.out.println(myObj.minNumber(nums1, nums2));
    }

    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Convert arrays to sets and find the smallest digits
        for (int num : nums1) {
            set1.add(num);
            min1 = Math.min(min1, num);
        }
        for (int num : nums2) {
            set2.add(num);
            min2 = Math.min(min2, num);
        }

        // Check for common digit
        for (int num : set1) {
            if (set2.contains(num)) {
                return num;
            }
        }

        // Construct the smallest number
        int result = 10 * Math.min(min1, min2) + Math.max(min1, min2);
        return result;
    }

    public int getMinimum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            ans = min;
        }
        return min;
    }
}
