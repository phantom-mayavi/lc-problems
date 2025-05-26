import java.util.stream.IntStream;

public class MaximumSubArray_53 {
    public static void main(String[] args) {
        MaximumSubArray_53 myObj = new MaximumSubArray_53();
        System.out.println(myObj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(myObj.maxSubArray(new int[]{1}));
        System.out.println(myObj.maxSubArray(new int[]{5,4,-1,7,8}));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
