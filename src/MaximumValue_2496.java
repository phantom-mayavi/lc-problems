import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MaximumValue_2496 {
    public static void main(String[] args) {
        MaximumValue_2496 myObj = new MaximumValue_2496();
        System.out.println(myObj.maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"}));
    }

    public int maximumValue(String[] strs) {
        AtomicInteger maxValue = new AtomicInteger(0);
        Arrays.stream(strs).forEach(s -> {
            boolean isNumeric = true;
            for (Character ch : s.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    isNumeric = false;
                    break;
                }
            }
            maxValue.set(Math.max(maxValue.get(), isNumeric ? Integer.parseInt(s) : s.length()));
        });

        return maxValue.get();
    }
}
