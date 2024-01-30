class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] ans=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                   count++; 
                }
            }
            
             if(count>max){
                 max=count;
                 ans[0]=i;
                 ans[1]=max;
             }
            
            
        }
        return ans;
    }
}