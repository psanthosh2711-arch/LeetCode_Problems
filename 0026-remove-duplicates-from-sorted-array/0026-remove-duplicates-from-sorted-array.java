class Solution {
    public int removeDuplicates(int[] nums) {
        int first=0;
        int second=1;
        while(second<nums.length){
            if(nums[first]==nums[second]){
                second=second+1;
            }
            else{
                first=first+1;
                int temp=nums[first];
                nums[first]=nums[second];
                nums[second]=temp;
                second=second+1;
            }
        }
        return first+1;
    }
}