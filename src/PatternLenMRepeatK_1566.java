public class PatternLenMRepeatK_1566 {
    public static void main(String[] args) {
        PatternLenMRepeatK_1566 myObj = new PatternLenMRepeatK_1566();
        System.out.println(myObj.containsPattern(new int[]{1,2,4,4,4,4}, 1, 3));
        System.out.println(myObj.containsPattern(new int[]{1,2,1,2,1,1,1,3}, 2, 2));
        System.out.println(myObj.containsPattern(new int[]{1,2,1,2,1,3}, 2, 3));
        System.out.println(myObj.containsPattern(new int[]{2,2}, 1, 2));
    }

    public boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;
        for (int i = 0; i + m < arr.length; i++) {
            count = arr[i] == arr[i + m] ? count + 1 : 0;
            if (count == (k -1) * m) {
                return true;
            }

        }

        return false;
    }
}
