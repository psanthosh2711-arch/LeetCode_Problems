class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int max_sum=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max_sum){
                max_sum=sum;
            }
        }
        return max_sum;
    }
}