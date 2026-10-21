class Solution {
    public int rob(int[] nums) {
        int p2 = 0;
        int p1 = 0;

        for (int money : nums) {
            int current = Math.max(p1, p2 + money);
            p2 = p1;
            p1 = current;
        }

        return p1;
    }
}
