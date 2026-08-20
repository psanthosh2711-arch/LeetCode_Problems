class Solution {
    public int reverse(int x) {
       int s=0;
       int rem;
       int val;
       while(x!=0){
        rem=x%10;
        if(s>Integer.MAX_VALUE/10 || s==Integer.MAX_VALUE/10 && rem>7){
            return 0;
        }
        else if(s<Integer.MIN_VALUE/10 || s==Integer.MIN_VALUE/10 && rem<-8){
            return 0;
        }
        s=s*10+rem;
        x=x/10;
       }
       return s;

    }
}