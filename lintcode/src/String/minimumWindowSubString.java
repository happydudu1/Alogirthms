package String;

import java.util.HashMap;

public class minimumWindowSubString {
	  public static String minWindow(String s, String t) {
	        if (s==null||s.length()==0||t==null || t.length()==0) return "";
	        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
	        HashMap<Character, Integer> isFound=new HashMap<Character,Integer>();
	        char[] arr=s.toCharArray();
	        char[]  arrT=t.toCharArray();
	        for(char c:arrT){
	           
	            if (map.containsKey(c)){
	                map.put(c,map.get(c)+1);
	            }else{
	                map.put(c,1);
	            }
	        }
	        
	   
	        String res=""; 
	        int pre=0;
	        int local=0;
	        int lt=t.length();
	        for(int i=0;i<arr.length;i++){
	            char c=arr[i];
	           
	            if (map.containsKey(c)){
	               
	                 if (isFound.containsKey(c)){
	                     isFound.put(c,isFound.get(c)+1);
	                 }else{
	                     isFound.put(c,1);
	                 }
	                 if (isFound.get(c)<=map.get(c)){
	                     local++;
	                 }
	                 if (local==lt){//find it
	                    if (res.equals("")){
	                        res=s.substring(pre,i+1);
	                      
	                    }else{
	                        if (i-pre+1<res.length()){
	                            res=s.substring(pre,i+1);
	                        }
	                    }
	                       //need to move pre index
	                     isFound.put(arr[pre],isFound.get(arr[pre])-1);
	                     local--;
	                     pre++;
	                     while(pre<i&&!map.containsKey(arr[pre])){
	                         pre++;
	                     }
	                 }
	              
	                 
	            }else{
	                if (pre==i){
	                    pre++;
	                }
	            } 
	        }
	        return res;
	    }
	  
	  public static void main(String[] args){
		  minWindow("bdab","ab");
	  }
}
