package combination;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {
	  public static List<List<Integer>> combinationSum2(int[] num, int target) {
	        List<List<Integer>> res=new ArrayList<List<Integer>>();
	        if (num==null||num.length==0) return res;
	        Arrays.sort(num);
	        sumHelper(num,0,target,res, new ArrayList<Integer>());
	        return res;
	    }
	    
	    public static void sumHelper(int[] num, int start, int target, List<List<Integer>> results,List<Integer> res){
	        if (target==0){
	            results.add(new ArrayList<Integer>(res));
	            return;
	        }
	        if (start>=num.length||target<0){
	            return;
	        }
	        for(int i=start;i<num.length;i++){
	            if (target<num[i]){
	                return;
	            }
	            if (i==start||(i!=start&&num[i]!=num[i-1])){
	               res.add(num[i]);
	               sumHelper(num,i+1,target-num[i],results,res);
	               res.remove(res.size()-1);
	               
	            } 
	        }
	    }
	    
	    public static void main(String[] args){
	    	int[] num={7,1,2,5,1,6,10};
	    	combinationSum2(num,8);
	    }
	    
	    
}
