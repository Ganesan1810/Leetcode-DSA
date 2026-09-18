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
    public void dfs(TreeNode node , String path,List<String> res)
    {
        path+=node.val;
        if(node.left==null && node.right==null)
        {
            res.add(path);
            return;
        }
        if(node.left!=null) 
            dfs(node.left,path+"->",res); 
        if(node.right!=null) 
            dfs(node.right,path+"->",res); 
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        if(root!=null)
            dfs(root,"",res);
        return res;
    }
}