public class Small_No_From_2_Digit_arrays_2605 {
    public static void main(String[] args) {
        Small_No_From_2_Digit_arrays_2605 myObj = new Small_No_From_2_Digit_arrays_2605();
        int[] nums1 = {3,5,2,6}, nums2 = {3,1,7};
        System.out.println(myObj.minNumber(nums1, nums2));
    }

    public int minNumber(int[] nums1, int[] nums2) {
        int minNumber = 100;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int tempNo;
                if (nums1[i] < nums2[j]) {
                    tempNo = nums1[i] * 10 + nums2[j];
                } else if (nums1[i] > nums2[j]) {
                    tempNo = nums2[j] * 10 + nums1[i];
                } else {
                    tempNo = nums1[i];
                }

                if (tempNo < minNumber) {
                    minNumber = tempNo;
                }
            }
        }

        return minNumber;
    }
}
