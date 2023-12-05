package samples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayEqualRevSubStr_1460 {
    public static void main(String[] args) {
        System.out.println(new ArrayEqualRevSubStr_1460().canBeEqual(new int[]{1,2,3,4, 5}, new int[]{2,4,1,3}));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }

        return true;
    }
}
