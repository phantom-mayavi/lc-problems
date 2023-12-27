public class CommonElements2Arrays_2956 {
    public static void main(String[] args) {
        int[] answer = new CommonElements2Arrays_2956()
                .findIntersectionValues(new int[]{3,4,2,3}, new int[]{1,5});
        System.out.println(answer[0] + " " + answer[1]);
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] answer = new int[]{0, 0};
        for (int i = 0 ; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    answer[0] += 1;
                    break;
                }
            }
        }

        for (int i = 0 ; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    answer[1] += 1;
                    break;
                }
            }
        }

        return answer;
    }
}
