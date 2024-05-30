import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountSymmetricIntegers_2843 {
    public static void main(String[] args) {
        String valStr = "1200";
        System.out.println(valStr.substring(0, valStr.length() / 2));
        System.out.println(valStr.substring(valStr.length() / 2, valStr.length()));
        int value = 1200;
        List<Integer> list = new ArrayList<>();

        while (value > 0) {
            list.add(value % 10);
            value = value / 10;
        }

        System.out.println("noOfSymInt " + new CountSymmetricIntegers_2843().countSymmetricIntegers(1200, 1230));
    }

    public int countSymmetricIntegers(int low, int high) {
        AtomicInteger noOfSymInt = new AtomicInteger(0);
        IntStream.rangeClosed(low, high).forEach(value -> {
            String valStr = String.valueOf(value);
            if (valStr.length() % 2 == 0) {
                System.out.println("cur num " + value);
                String firstPart = valStr.substring(0, valStr.length() / 2);
                AtomicInteger sumFirstPart = new AtomicInteger(0);
                firstPart.chars().forEach(currNum -> {
                    sumFirstPart.addAndGet(currNum - '0');
                });

                String secondPart = valStr.substring(valStr.length() / 2, valStr.length());
                AtomicInteger sumSecondPart = new AtomicInteger(0);
                secondPart.chars().forEach(currNum -> {
                    sumSecondPart.addAndGet(currNum - '0');
                });

                if (sumFirstPart.get() == sumSecondPart.get()) {
                    noOfSymInt.addAndGet(1);
                }

            }

        });

        return noOfSymInt.get();
    }
}
