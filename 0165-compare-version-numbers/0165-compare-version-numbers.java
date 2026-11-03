class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");

        int i = 0;

        while (i < a.length || i < b.length) {
            int x = 0;
            int y = 0;

            if (i < a.length) {
                x = Integer.parseInt(a[i]);
            }

            if (i < b.length) {
                y = Integer.parseInt(b[i]);
            }

            if (x > y) return 1;
            if (x < y) return -1;

            i++;
        }

        return 0;
    }
}