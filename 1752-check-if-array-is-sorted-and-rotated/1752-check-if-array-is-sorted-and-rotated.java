class Solution {
    public boolean check(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i]>nums[i+1]){
                int pivot=nums[i+1];
                int j=i+1;
                while(j<nums.length){
                    if(nums[j]>=pivot && nums[j]<=nums[0]){
                        pivot=nums[j];
                        j=j+1;
                    }
                    else{
                        return false;
                    }
                }
                if(j==nums.length){
                    return true;
                }
            }
            else{
                i=i+1;
            }
        }
        if(i==nums.length-1){
            return true;
        }
        else{
            return false;
        }

    }
}