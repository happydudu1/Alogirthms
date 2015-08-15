package binarySearchTree;

import java.util.ArrayList;
import java.util.*;

public class PathSum {
	  public static List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> res=new  ArrayList<List<Integer>>();
	        
	        finder(root,sum,res,new ArrayList<Integer>());
	        return res;
	    }
	    
	    public static void finder(TreeNode root, int sum, List<List<Integer>> res,ArrayList<Integer> sol){
	        if (root==null) return;
	        if (root.left==null&&root.right==null){
	            if (root.val==sum){
	                sol.add(root.val);
	                res.add(new ArrayList<Integer>(sol)); 
	                sol.remove(sol.size()-1);
	            }
	            return;
	        }
	     
	           sol.add(root.val);
	           sum=sum-root.val;
	           finder(root.left,sum ,res, sol );
	            sol.remove(sol.size()-1);
	             sol.add(root.val);
	           finder(root.right,sum ,res, sol );
	            sol.remove(sol.size()-1); 
	    }
	    
	    public static void main(String[] args){
	    	TreeNode root=new TreeNode(0);
	    	TreeNode l=new TreeNode(1);
	    	TreeNode r=new TreeNode(1);
	    	root.left=l;
	    	root.right=r;
	    	System.out.println(pathSum(root,1));
	    }
	    
}
