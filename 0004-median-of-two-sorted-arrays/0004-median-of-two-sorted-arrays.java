class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int left_part=(m+n+1)/2;
        int n1_left,n2_left,n1_right,n2_right;
        double median=0.00;
        if(n>m){
            return findMedianSortedArrays(nums2,nums1);
        }
        int first=0;
        int last=nums1.length;
        while(first<=last){
            int cut1=(first+last)/2;
            int cut2=left_part-cut1;
            if(cut1!=0){
                n1_left=nums1[cut1-1];
            }
            else{
                n1_left=Integer.MIN_VALUE;
            }
            if(cut1!=nums1.length){
                n1_right=nums1[cut1];
            }
            else{
                n1_right=Integer.MAX_VALUE;
            }
            if(cut2!=0){
                n2_left=nums2[cut2-1];
            }
            else{
                n2_left=Integer.MIN_VALUE;
            }
            if(cut2!=nums2.length){
                n2_right=nums2[cut2];
            }
            else{
                n2_right=Integer.MAX_VALUE;
            }
            if(n1_left<=n2_right && n2_left<=n1_right){
                int total=n+m;
                if(total%2==0){
                    median=(Math.max(n1_left,n2_left)+Math.min(n1_right,n2_right))/2.0;
                    return median;
                }
                else{
                    median=Math.max(n1_left,n2_left);
                    return median;
                }
            }
            else if(n2_left>n1_right){
                first=cut1+1;
            }
            else{
                last=cut1-1;
            }
        }
        return 0.00;
    }
}