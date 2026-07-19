class Solution {
    public int maxProfit(int[] prices) {
        int index=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                for(int j=i+1;j<prices.length;j++){
                    int diff=prices[j]-prices[i];
                    if(diff>max){
                        max=diff;
                    }
                }
            }
        }
        if(max<0){
            return 0;
        }
        return max;
    }
}