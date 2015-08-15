package IntegerArray;
import java.util.ArrayList;
import java.util.Collections;
 
public class subset {
	  public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
	       ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	       if (S.size()==0) return res;
	       res.add(new ArrayList<Integer>());
	       Collections.sort(S);
	       for(int i=0;i<S.size();i++){
	    	   ArrayList<ArrayList<Integer>> tmpRes=new ArrayList<ArrayList<Integer>>(res);
	           for(ArrayList<Integer> l:res){
	               ArrayList<Integer> tmp= new ArrayList<Integer>(l);
	               tmp.add(S.get(i));
	               tmpRes.add(tmp);
	           }
	           res.addAll(tmpRes);
	       }
	       return res;
	    }
	  
	  public static void main(String[] args){
		  ArrayList<Integer> S=new ArrayList<Integer>();
		  S.add(1);
		  S.add(2);
		  S.add(3);
		  System.out.println(subsets(S));
	  }
	  
}
