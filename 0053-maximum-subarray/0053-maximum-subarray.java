class Solution {

    public int maxSubArray(int[] nums) {
        int ans=nums[0]; //-2
        int sum=nums[0];//-2
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=0; //0 i=3 ,4 sum=0;
            }
            sum=sum+nums[i]; // 0+1+-3 =-2 , 0+4=4, 4-1=3, 3+2=5, 5+1=6, 6-5=1, 1+4=5 
            ans=Math.max(ans,sum); //1 , 4 , 5,6, 
            
        }
        return ans;
        
    }    
}