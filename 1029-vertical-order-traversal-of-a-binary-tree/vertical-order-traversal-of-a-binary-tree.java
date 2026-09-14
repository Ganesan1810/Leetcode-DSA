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
    public void dfs(TreeNode root,int r,int c,List<int[]> list){
        if(root == null)
            return;
        list.add(new int[] {c,r,root.val});

        dfs(root.left,r+1,c-1,list); // move left node
        dfs(root.right,r+1,c+1,list); // move right node 
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        ArrayList<int[]> nodes=new ArrayList<>();
        dfs(root,0,0,nodes);

        nodes.sort((a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]); 
            if(a[1]!=b[1]) return Integer.compare(a[1],b[1]);
            return Integer.compare(a[2],b[2]);
        });

        ArrayList<List<Integer>> ans = new ArrayList<>();
        int col = Integer.MIN_VALUE;
        // column change ana new Arraylist create pannanum
        for(int[] n:nodes){
            if(n[0]!=col){
                ans.add(new ArrayList<>());
                col=n[0];
            }
            ans.get(ans.size()-1).add(n[2]); // 

        }
        return ans;
    }
}