class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int first=0;first<nums.length;first++){
            int second=first+1;
            while(second<nums.length){
                if(nums[first]+nums[second]==target){
                    result[0]=first;
                    result[1]=second;
                    break;
                }
                second=second+1;
            }
        }
        return result;
    }
}