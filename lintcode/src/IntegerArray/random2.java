package IntegerArray;
/*
 * 有一个01随机生成函数，rand(2)，以p的概率生成1，1-p的概率生成0。请用这个生成函数设计一个等概率的01随机生成函数。
http://www.jiuzhang.com/problem/16/
 */
import java.util.Random;

public class random2 {
	private static Random random = new Random();
	 public int gen(){
	        int i1 = random.nextInt(1);
	        int i2 = random.nextInt(1);
	        if(i1==0 && i2==1)
	            return 1;
	        else if(i1==1 && i2==0)
	            return 0;
	        else
	            return gen();
	    }
	 
	 int Rand(){
	        int result = 0;  
	        int k=logn+1
	        for(int i = 0 ; i < k ; ++i){
	            if(gen() == 1)
	                result |= (1<<i);
	        }
	        if(result > n)
	            return Rand();
	        return result;
	    }
}
