package bits;

public class singleNumberII {
	  public static int singleNumberII(int[] A) {
	        int[] count=new int[32];
	        int res=0;
	       
	        for(int i=0;i<A.length;i++){
	        	  System.out.println(A[i]+"==========");
	        	  for(int j=0;j<32;j++){ 
	            	 System.out.println(count[j]+ " "+ ((A[i]>>j)&1));
	            	 if (((A[i]>>j)&1)==1){
	                    count[j]=(count[j]+1)%3;
	            	 }  
	                    System.out.println("count="+count[j]); 
	              } 
	         }
	          for(int i=0;i<32;i++){ 
	        	  res |=count[i]<<i;
	          }
	        return res;
	        
	    }
	  
	  public static void main(String[] args){
		  int[] a={1,1,2,3,3,3,2,2,4,1};
		  System.out.println((1+((2>>1)&1))%3);
		  System.out.println(singleNumberII(a));
	  }
}
