class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int first=0;
        int last=s.length()-1;
        while(first<last){
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            first=first+1;
            last=last-1;
        }
        return true;
        
    }
}