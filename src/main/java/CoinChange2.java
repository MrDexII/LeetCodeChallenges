import java.util.Arrays;

public class CoinChange2 {

    // req https://www.youtube.com/watch?v=m8ocJK_PWbw
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return cc(coins, 0, amount, dp);
    }

    private int cc(int[] coins, int i, int amount, int[][] dp) {
        if (amount == 0) return 1;
        if (amount < 0 || i == coins.length) return 0;
        if (dp[i][amount] != -1) return dp[i][amount];
        return dp[i][amount] = cc(coins, i, amount - coins[i], dp) + cc(coins, i + 1, amount, dp);
    }

    // 6 ms solution 2 dimensional solution
    public int change2(int amount, int[] coins) {
        if (amount == 0) return 1;
        if (coins == null || coins.length == 0) return 0;

        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j] + (j >= coins[i - 1] ? dp[i][j - coins[i - 1]] : 0);
            }
        }
        return dp[coins.length][amount];
    }

    //2 ms solution one dimensional array
    public int change3(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int x = coin; x < amount + 1; ++x) {
                dp[x] += dp[x - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        CoinChange2 coinChange2 = new CoinChange2();

        int amount = 10;
        int[] coins = {1, 2, 5};

        System.out.println(coinChange2.change2(amount, coins));

    }
}
