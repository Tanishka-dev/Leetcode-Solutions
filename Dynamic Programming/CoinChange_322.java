class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp= new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int a=minCoin(amount,coins,dp);     
        if(a>amount)
            return -1;
        return a;
    }    
    int minCoin(int amount, int[] coins, int[] dp){
        if(amount==0)
            return 0;
        
        int ans=Integer. MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(amount-coins[i]>=0){
              int subAns=0;
            
            if(dp[amount-coins[i]]!=-1){
                subAns=dp[amount-coins[i]];
            }
             else
                 subAns=minCoin(amount-coins[i],coins,dp);
            
            if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                ans=subAns+1;
            }
          }
        }
        return dp[amount]=ans;        
    }     
}