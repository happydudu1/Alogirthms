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
	  
	  public static int[][] generateMatrix2(int n) {
	        
	        if (n==0) return new int[n][n];
	        int[][] res=new int[n][n];
	        int count=1;
	        for(int i=0;i<n/2;i++){
	            for(int j=i;j<n-i;j++){
	                res[i][j]=count++; 
	            }
	            for(int j=i+1;j<n-i;j++){
	                res[j][n-i-1]=count++;
	            }
	            for(int col=n-i-2;col>=i;col--){
	                res[n-i-1][col]=count++;
	            }
	            for(int row=n-i-2;row>i;row--){
	                res[row][i]=count++;
	            }
	        }
	        if (n%2==1){
	            res[n/2][n/2]=count;
	        }
	        return res;
	    }
	  
	  public static void main(String[] args){
		  int n=3;
		  int[][] res=generateMatrix2(n);
		  for(int i=0;i<n;i++){
			  for(int j=0;j<n;j++){
				  System.out.println(res[i][j]);
			  }
		  }
	  }
}
