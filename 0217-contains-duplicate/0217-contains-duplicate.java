class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        System.out.print(hs.size()+" array"+nums.length);
        
        return (hs.size()!=nums.length) ? true:false;
        
    }
}