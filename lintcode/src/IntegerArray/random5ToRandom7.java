package IntegerArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class random5ToRandom7 {
 
	    private static Random random = new Random();
	    private static int[][] arr = new int[][]{
	        {1,2,3,4,5},
	        {6,7,1,2,3},
	        {4,5,6,7,1},
	        {2,3,4,5,6},
	        {7,0,0,0,0}
	    };
	 
	    public static int rand5(){
	     //   random.setSeed(System.nanoTime());
	        return random.nextInt(5) + 1;
	    }
	     
	    public static int rand7_1() {
	        int i = rand5() - 1;
	        int j = rand5() - 1;
	         
	        if (i == 4 && j >= 1)
	            return rand7_1();
	 
	        return arr[i][j];
	    }
	    
	    public static int rand7_2() {
	        int i = rand5();
	        int j = rand5();
	 
	        int res = 5 * (i - 1) + j;
	 
	        if (res > 21)
	            return rand7_2();
	 
	        return res % 7 + 1;
	    }
	
	    
	    public static void main(String[] args){
	    	Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
	    	 
	    	for (int i = 0; i < 10000000; i++) {
	    	    int key = rand7_1();
	    	    Integer val = counter.get(key);
	    	    if (null == val)
	    	        val = 0;
	    	    val++;
	    	    counter.put(key, val);
	    	}
	    	 
	    	for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
	    	    System.out.println(entry.getKey() + ": " + entry.getValue());
	    	}
	    }
}

