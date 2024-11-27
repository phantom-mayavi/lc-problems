import java.util.stream.IntStream;

public class NumWithEvenDigits_1295 {
    public static void main(String[] args) {
        NumWithEvenDigits_1295 myObj = new NumWithEvenDigits_1295();
        System.out.println(myObj.findNumbers1(new int[]{12,345,2,6,7896}));
        System.out.println(myObj.findNumbers1(new int[]{555,901,482,1771}));
    }

    public int findNumbers1(int[] nums) {
        var ref = new Object() {
            int count = 0;
        };
        IntStream.range(0, nums.length).forEach(i -> {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                ref.count++;
            }
        });

        return ref.count;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenDigits(nums[i])) {
                count++;
            }
        }

        return count;
    }

    private boolean isEvenDigits(int num) {
        int digitCount = 0;
        while (num > 0) {
            num /= 10;
            digitCount++;
        }

        return digitCount % 2 == 0;
    }
}
