import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlay {
    public static void main(String[] args) {
        // [[1,3],[2,6],[8,10],[15,18]]

        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<int[]> mergedIntervals = mergeIntervals(arr);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    private static List<int[]> mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return Arrays.asList(intervals);
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // Non-overlapping interval, add currentInterval to result
                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        // Add the last interval
        result.add(currentInterval);

        return result;
    }
}
