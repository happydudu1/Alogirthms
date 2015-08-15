package DP;

public class longestSubstringWithoutRepeating {
	 
	    public   int lengthOfLongestSubstring(String s) {
	        int count = 0;
	        int i=0,j=0;
	        byte[] set =new byte[256];
	        while(j<s.length()){
	            set[s.charAt(j)]++;
	           // System.out.println(set[s.charAt(j)]);
	            while(set[s.charAt(j)]>1){
	                count = Math.max(count,j-i);
	                set[s.charAt(j)]--;
	                i++;
	            }
	            j++;
	        }
	        
	        return Math.max(count,j-i);
	    }
	
	    
	    public static void main(String[] args){
	    	
	    	System.out.println(lengthOfLongestSubstring("ababc"));
	    }

}
