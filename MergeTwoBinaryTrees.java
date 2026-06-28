class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1,root2);

    }
    public TreeNode merge(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return null;
        }
        if(root1!=null && root2==null){
            return root1;
        }
        if(root1==null && root2!=null){
            return root2;
        }
        TreeNode sum=new TreeNode(root1.val+root2.val);
        sum.left=merge(root1.left,root2.left);
        sum.right=merge(root1.right,root2.right);
        return sum; 
    }
}
