import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] ans = new int[intervals.length][2];
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (count == 0 || ans[count - 1][1] < intervals[i][0]) {
                ans[count++] = intervals[i];
            } else {
                ans[count - 1][1] = Math.max(
                    ans[count - 1][1], intervals[i][1]
                );
            }
        }

        return Arrays.copyOf(ans, count);
    }
}