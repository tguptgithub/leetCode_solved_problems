class Solution {
   public static List<List<Integer>> ans;
    public static void printSubset(int[] nums, int i, List<Integer> subset){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(subset));
            return;
        }
          printSubset(nums, i+1, subset);
          subset.add(nums[i]);
          printSubset(nums, i+1, subset);
        subset.remove(subset.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
       ans =new ArrayList<>();
        List<Integer> res=new ArrayList<Integer>();
        printSubset(nums, 0, res);
        return ans;
        
    }
}