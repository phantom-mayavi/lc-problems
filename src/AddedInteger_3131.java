import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddedInteger_3131 {
    public static void main(String[] args) {
        AddedInteger_3131 myObj = new AddedInteger_3131();
        System.out.println(myObj.addedInteger(new int[]{2, 6, 4}, new int[]{9, 7, 5}));
    }

    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            min1 = Math.min(min1, nums1[i]);
            min2 = Math.min(min2, nums2[i]);
        }
        return min2 - min1;

    }
}
