package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subStringWIthConWords {
	   public static List<Integer> findSubstring(String s, String[] words) {
	        List<Integer> res=new ArrayList<Integer>();
	        if (s.length()==0||words.length==0) return res;
	        HashMap<String, Integer> dict=new HashMap<String,Integer>();
	        for(String w:words){
	            if(dict.containsKey(w)){
	                 dict.put(w, dict.get(w)+1);
	            }else{
	                dict.put(w,1);
	            }
	        }
	        HashMap<String, Integer> map=new HashMap<String,Integer>();
	        int l=words[0].length();
	        int left=0;
	        int i=0;
	        int count=0;
	        while(i<=s.length()-l){
	            String curr=s.substring(i,i+l);
	            if (dict.containsKey(curr)){
	                if (map.containsKey(curr)){
	                    map.put(curr,map.get(curr)+1);
	                }else{
	                    map.put(curr,1);
	                }
	                
	                if (map.get(curr)<=dict.get(curr)){
	                    count++;
	                } 
	                if (count==words.length){
	                    res.add(left);
	                    System.out.println(left);
	                    left=i+l+1;
	                    count=0;
	                    i+=l+1;
	                    map.clear();
	                }else{
	                    i+=l; 
	                } 
	                
	                
	            }else{
	                i++;
	                left++;
	                
	            }
	        }
	        return res;
	    }
	   
	   public static void   main(String[] args){
		   String[] words={"foo","bar","the"};
		   String s="barfoothefoobarman";
		   findSubstring(s,words);
	   }
}
