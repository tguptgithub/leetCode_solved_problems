/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        TreeNode temp=root;
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> qu=new ArrayDeque<>();
         qu.add(root);
        while(qu.size()>0){
            int sz=qu.size();
            for(int i=0;i<sz;i++){
                TreeNode rem=qu.remove();
                if(i==sz-1){
                    ans.add(rem.val);
                }
                if(rem.left!=null){
                    qu.add(rem.left);
                }
                if(rem.right!=null){
                    qu.add(rem.right);
                }
            }
        }
        return ans;
        
    }
}