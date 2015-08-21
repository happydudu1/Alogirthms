package Integer;

public class reverse {
	  public static int reverse(int x) {
		  
	        boolean isSigned=false;
	        if (x<0) { isSigned=true; x=0-x;}
	        long res=0;
	        System.out.println(x);
	        while(x>0){
	            res=res*10+x%10;
	            x=x/10;
	            System.out.println(x);
	             
	        }
	        System.out.println(Math.abs(Integer.MIN_VALUE));
	        System.out.println(!isSigned&&res>Integer.MAX_VALUE);
	        System.out.println(isSigned&&res>Math.abs(Integer.MIN_VALUE));
	        if ((!isSigned&&res>Integer.MAX_VALUE) || (isSigned&&0-res<Integer.MIN_VALUE)) return 0;
	        System.out.println("here");
	        return (int)(isSigned?(0-res):res);
	    }
	  
	  public static void main(String[] args){
		  System.out.println(reverse(-123));
	  }
}
