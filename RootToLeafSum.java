public class RootToLeafSum {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        return getSum(root,0);
    }
    private int getSum(TreeNode node,int curSum){
        if(node==null){
            return curSum;
        }
        int leftSum=0;
        int rightSum=0;
        if(node.left==null && node.right==null){
            return curSum*10+node.val;
        }
        if(node.left!=null){
            leftSum=getSum(node.left,curSum*10+node.val);
        }
        if(node.right!=null){
            rightSum= getSum(node.right,curSum*10+node.val); 
        }
        return rightSum+leftSum;
    }
}
