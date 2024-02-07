class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
        int[] ans=new int[n];
        int[] lprod=new int[n];
        int[] rprod=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                lprod[i]=nums[i];
            }else {
                lprod[i]=lprod[i-1]*nums[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rprod[i]=nums[i];
            }else {
                rprod[i]=rprod[i+1]*nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i==0){
                ans[i]=rprod[i+1];
            }else if(i==n-1){
                ans[i]=lprod[i-1];
            }else{
                ans[i]=lprod[i-1]*rprod[i+1];
            }
            
        }
        return ans;
    }
}