package IntegerArray;

import java.util.HashMap;

/*
 * http://www.lintcode.com/en/problem/longest-substring-with-at-most-k-distinct-characters/#
 * http://blog.csdn.net/whuwangyi/article/details/42451289
 */
public class lengthOfLongestSubStringKDistinct {
	 public int lengthOfLongestSubstringKDistinct(String s, int k) {
	       if (s==null) return 0;
	       if (s.length()<=k) return s.length(); 
	       HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	       int start=0;
	       int max=0;
	       for(int i=0;i<s.length();i++){
	           char c=s.charAt(i);
	           if (map.containsKey(c)){
	               map.put(c,map.get(c)+1);
	           }else{
	               map.put(c,1);
	               while(map.size()>k){
	               char s1=s.charAt(start++);
	               int count = map.get(s1);
	               if (count>1){
	                     map.put(s1,map.get(s1)-1);
	                  
	               }else{
	                  map.remove(s1);
	               }
	               
	             }
	           } 
	           max=Math.max(i-start+1,max);
	       }
	       return max;
	        
	    }
}
