import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval_57 {
    public static void main(String[] args) {
        InsertInterval_57 myObj = new InsertInterval_57();
        System.out.println(Arrays.deepToString(myObj.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
        System.out.println(Arrays.deepToString(myObj.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8})));
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] outputInterval = new int[][]{};
        int n = intervals.length, i = 0;
        List<int[]> result = new ArrayList<>();

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        while (i < n && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    private static boolean isNumberWithinRange(int numToCheck, int[] interval) {
        return numToCheck > interval[0] && numToCheck < interval[1];
    }
}
