package IntegerArray;

public class spiralMatrixII {
	  public static int[][] generateMatrix(int n) {
	        int[][] res=new int[n][n];
	        if (n==0) return res;
	        int col1=0;
	        int col2=n;
	        int row1=0;
	        int row2=n;
	        int count=1;
	        while(col1<col2&&row1<row2){
	            for(int i=col1;i<col2;i++){
	                res[row1][i]=count++;
	            }
	            row1++;
	            for(int i=row1;i<row2;i++){
	                res[i][col2-1]=count++;
	            }
	            col2--;
	            if (col1<col2&&row1<row2){
	                for(int i=col2-1;i>=0;i--){
	                    res[row2-1][i]=count++;
	                }
	                row2--;
	            }    
	             if (col1<col2&&row1<row2){
	                for(int i=row2;i>=row1;i--){
	                    res[i][col1]=count++;
	                }
	                col1++;
	             }    
	        }
	        return res;
	    }
	  
	  public static void main(String[] args){
		  System.out.println(generateMatrix(3));
	  }
}
