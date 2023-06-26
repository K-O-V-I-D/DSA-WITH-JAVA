class Solution {
    public int tallestBillboard(int[] rods) {
        int sum = 0;
        for (int rod : rods) {
sum += rod;
        }

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int rod : rods) {
            int[] current = dp.clone();
            for (int h = 0; h <= sum - rod; h++) {
                if (dp[h] < 0) {
                    continue;
                }
                current[h + rod] = Math.max(current[h + rod], dp[h]);
                current[Math.abs(h - rod)] = Math.max(current[Math.abs(h - rod)], dp[h] + Math.min(h, rod));
            }
            dp = current;
        }

        return dp[0];
    }
}
