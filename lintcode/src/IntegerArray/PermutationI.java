package IntegerArray;

public class PermutationI {
	//solution 1 - recursive
	  public ArrayList<ArrayList<Integer>> permute1(ArrayList<Integer> nums) {
	        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	        if (nums==null||nums.size()==0) return res;
	        helper(res,new ArrayList<Integer>(),nums);
	        return res;
	    }
	    
	    public void helper( ArrayList<ArrayList<Integer>> res,ArrayList<Integer> sol,ArrayList<Integer> nums){
	        if (nums.size()==sol.size()){
	            res.add(new ArrayList<Integer>(sol));
	            return;
	        }
	        for(int i=0;i<nums.size();i++){
	            if (sol.contains(nums.get(i))){
	                continue;
	            }
	            sol.add(nums.get(i));
	            helper(res,sol,nums);
	            sol.remove(sol.size()-1); 
	        }
	    }
	    
	    public ArrayList<ArrayList<Integer>> permute2(ArrayList<Integer> nums) {
	        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	        if (nums==null||nums.size()==0) return res;
	        
	        res.add(new ArrayList<Integer>());
	        for(int i=0;i<nums.size();i++){
	            ArrayList<ArrayList<Integer>> cur= new ArrayList<ArrayList<Integer>>();
	            for(ArrayList<Integer> l:res){
	                for(int j=0;j<l.size()+1;j++){
	                    ArrayList<Integer> tmp=new ArrayList<Integer>(l);
	                    tmp.add(j,nums.get(i));
	                    cur.add(tmp);
	                }
	            }
	            res=new ArrayList<ArrayList<Integer>>(cur);
	        }  
	        return res;
	    }
}
