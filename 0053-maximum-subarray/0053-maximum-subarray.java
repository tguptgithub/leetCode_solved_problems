class Solution {

    public int maxSubArray(int[] nums) {
         int ans=nums[0];
        int sum=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            ans=Math.max(ans, sum);
        }
        return ans;
            }
        
      
    
}