class Solution {
    public char findTheDifference(String s, String t) {
        int ans=0;
        int n=s.length();
        int m=s.length();
        if(n>m){
            for(int i=0;i<n;i++){
                if(i<m){
                    ans=ans^s.charAt(i)^t.charAt(i);
                    System.out.printf("%d",ans);
                }
                else{
                    ans=ans^s.charAt(i);
                }
            }
        }
        else{
            for(int i=0;i<=m;i++){
                if(i<n){
                    ans=ans^s.charAt(i)^t.charAt(i);
                    System.out.printf("%d",ans);
                }
                else{
                    ans=ans^t.charAt(i);
                    System.out.printf("%d",ans);
                }
            }

        }
        return (char)ans;
    }
}