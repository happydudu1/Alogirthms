package binarySearchTree;

public class sumRootToLeafNumbers {
    public static int sumNumbers(TreeNode root) {
        if (root==null) return 0;
        int sum=0;
        helper(root,sum,"");
        return sum;
    }
    
    public static void helper(TreeNode root, int sum,String cur){
        if (root==null) return;
        if (root.left==null&&root.right==null){
            cur+=root.val;
            sum+=Integer.parseInt(cur);
            return;
        }
        cur+=root.val;
        helper(root.left,sum,cur);
        helper(root.right,sum,cur);
    }
    
    public static void main(String[] args){
    	TreeNode root=new TreeNode(9);
    	sumNumbers(root);
    }
}
