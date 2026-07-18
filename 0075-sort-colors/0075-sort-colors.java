class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high=high-1;
            }
            else if(nums[mid]==0){
                int t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                low=low+1;
                mid=mid+1;
            }
            else{
                mid=mid+1;
            }
        }
    }
}