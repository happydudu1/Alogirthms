package IntegerArray;

public class reverseInteger {
	  public static int reverseInteger(int n) {
	       if (n<10&&n>-10) return n;
	       
	       long a=0;
	       long res=0;
	       if (n<0) a=-n;
	       else a=n;
	       int mod=10;
	       while(a>0){
	           res=res*10+a%mod;
	           a/=mod;
	       }
	       System.out.println(res);
	       if (n<0){
	           res=0-res;
	           if (res<Integer.MIN_VALUE) res=0;
	       }else{
	           if (res>Integer.MAX_VALUE) res=0;
	       }
	       return (int)res;
	       
	    }
	  public static void main(String[] args){
		  System.out.println(reverseInteger(123));
	  }
}
