class Solution {
    public void rotate(int[] nums, int k) {
        int first=0;
        int last=nums.length-1;
        reverse(nums,first,last);
        first=0;
        k=k%nums.length;
        last=k-1;
        reverse(nums,first,last);
        first=k;
        last=nums.length-1;
        reverse(nums,first,last);
        
    }
    public void reverse(int[] nums,int first,int last){
        while(first<last){
            int temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first=first+1;
            last=last-1;        
        }
    }
}