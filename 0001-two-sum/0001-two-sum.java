class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n=nums.length;
       // Arrays.sort(nums);
        int[] ans=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int sum=target-nums[i];
            if(hm.containsKey(sum)){
                ans[0]=hm.get(sum);
                ans[1]=i;
                
            }else{
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}