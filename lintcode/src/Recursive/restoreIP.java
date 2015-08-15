package Recursive;

import java.util.ArrayList;
import java.util.List;

public class restoreIP {
	 public static List<String> restoreIpAddresses(String s) {
	        List<String> res=new ArrayList<String>();
	        if (s==null||s.length()<4||s.length()>12){
	            return res;
	        }
	        helper(s,0,4,res,"");
	        return res;
	    }
	    
	    public static void helper(String s, int start,int n, List<String> res, String curSol){
	        if (start>=s.length()&&n==0){
	        	System.out.println(curSol);
	            res.add(curSol);
	            
	            return;
	        }
	        for(int i=start+1; i<=s.length() &&i<=start+3;i++){
	            if (isValidIP(s.substring(start,i))){
	                String tmp=curSol;
	                if (curSol.length()==0) tmp=s.substring(start,i);
	                else tmp+="."+s.substring(start,i);
	                System.out.println(i+ " "+tmp);
	                helper(s,i,n-1,res,tmp);
	                
	            }
	        }
	    }
	    
	    public static boolean isValidIP(String s){
	        if (s.length()>1&&s.charAt(0)=='0') return false;
	        int val=Integer.parseInt(s);
	        if (val<=255&&val>=0) return true;
	        return false;
	    }
	    
	    public static void main(String[] args){
	    	restoreIpAddresses("0000");
	    }
}
