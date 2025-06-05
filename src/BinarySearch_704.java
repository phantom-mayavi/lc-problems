public class BinarySearch_704 {
    public static void main(String[] args) {
        BinarySearch_704 myObj = new BinarySearch_704();
        System.out.println(myObj.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(myObj.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else  {
                return mid;
            }
        }


        return -1;
    }
}
