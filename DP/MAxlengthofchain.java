class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a0, int[] a1){
                if (a0[0] != a1[0]){
                    return a0[0] - a1[0];
                }
                return a0[1] - a1[1];
            }
        });
        int[] dp = new int[pairs.length];
        for (int i = 1; i < pairs.length; ++ i){
            for (int j = 0; j < i; ++ j){
                if (pairs[j][1] < pairs[i][0]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[dp.length - 1] + 1;

    }
}