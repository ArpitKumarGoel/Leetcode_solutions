class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList();
        findPathSum(root,targetSum,result,new ArrayList());
        return result;
    }
    public void findPathSum(TreeNode root,int targetSum,List<List<Integer>> result,List<Integer> current){
        if(root == null){
            return;
        }
        current.add(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0){
            result.add(new ArrayList(current));
        }
        findPathSum(root.left,targetSum-root.val,result,current);
        findPathSum(root.right,targetSum-root.val,result,current);
        current.remove(current.size()-1);
    }
}
