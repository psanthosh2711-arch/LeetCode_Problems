class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        int count=0;
       
        while(i>=0){
            if(nums[i]>=nums[i+1]){
                i=i-1;
                count=count+1;
            }
            else{
                int last=nums.length-1;
                while(last>i){
                    if(nums[last]>nums[i]){
                        int temp=nums[i];
                        nums[i]=nums[last];
                        nums[last]=temp;
                        break;
                    }
                    last=last-1;
                }
                int first=i+1;
                int second=nums.length-1;
                while(first<second){
                    int change=nums[first];
                    nums[first]=nums[second];
                    nums[second]=change;
                    first=first+1;
                    second=second-1;
                }
                break;
            }
        }
        if(count==nums.length-1){
            Arrays.sort(nums);
        }
        System.out.println(Arrays.toString(nums));
    }
}