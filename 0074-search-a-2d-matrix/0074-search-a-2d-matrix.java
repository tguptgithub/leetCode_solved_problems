class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
     //bruteForce
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        //Little optimised
        // Applying binary search in rowwise:
        // for(int i=0;i<n;i++){
        //     int k=0; int j=m-1;
        //     while(k<=j){
        //     int mid=(k+j)/2;
        //     if(matrix[i][mid]==target){
        //         return true;
        //     }else if(matrix[i][mid]<target) {
        //         k++;}else{
        //             j--;
        //         }
        //     }
        // }
        // return false;
        // column wise traversal
          for(int i=0;i<m;i++){
            int k=0; int j=n-1;
            while(k<=j){
            int mid=(k+j)/2;
            if(matrix[mid][i]==target){
                return true;
            }else if(matrix[mid][i]<target) {
                k++;}else{
                    j--;
                }
            }
        }
        return false; 
        
        
    
    }
}