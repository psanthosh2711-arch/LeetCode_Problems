class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int index=0;
        for(int i=0;i<grid.length;i++){
            index=-1;
            if(grid[i][0]<0){
                count=count+grid[i].length;
            }
            else{
                int first=0;
                int last=grid[i].length-1;
                while(first<=last){
                    int mid=(first+last)/2;
                    if(grid[i][mid]<0){
                        index=mid;
                        last=mid-1;
                    }
                    else{
                        first=mid+1;
                    }
                }
            }
            if(index>=0){
            count=count+(grid[i].length-index);
            }
        }
        return count;
    }
}