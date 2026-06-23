class Solution {
    public int search(int[] nums, int target) {
        int mid=nums.length/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            int first=0;
            int last=mid;
            while(first<=last){
                mid=(first+last)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]>target){
                    last=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
        }
        else{
            int first=mid+1;
            int second=nums.length-1;
            while(first<=second){
                mid=(first+second)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    second=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
        }
        return -1;   
    }
}