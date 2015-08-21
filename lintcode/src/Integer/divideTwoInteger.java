package Integer;

public class divideTwoInteger {
    public static int divide(int dividend, int divisor) {
        if (divisor==0) return Integer.MAX_VALUE;
        
        boolean isNeg=false;
        if (dividend<0) {
            isNeg=!isNeg;
          //  dividend=-dividend;
        }
        if (divisor<0){
            isNeg=!isNeg;
        //    divisor= -divisor;
        } 
        
        int res=0;  int i=0;  
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        if (b==1) return (int)(isNeg?0-a:a);
        while(a>=b){
            while((b<<(i+1))<=a){
                i++; 
            }
            res+=1<<i;
            a-=b<<i;
            i=0; 
        }
        return isNeg?0-res:res;
    }
	  
	  public static void main(String[] args){
		 System.out.println(divide(2,2));
		 
	  }
}
