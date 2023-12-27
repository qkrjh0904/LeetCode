class Solution {

    public static int[] memo = new int[46];

    public int climbStairs(int n) {
        memo[1] = 1;
        memo[2] = 2;
        gogo(3, n);
        return memo[n];
    }

    public void gogo(int now, int limit){
        if(now > limit){
            return;
        }

        memo[now] = (memo[now-1] + memo[now-2]);
        gogo(now + 1, limit);
    }
}