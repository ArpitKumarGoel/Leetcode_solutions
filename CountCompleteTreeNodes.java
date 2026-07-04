class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        int sum=leftNodes+rightNodes+1;
        return sum;

    }
}
