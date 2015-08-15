package SystemDesign;

import java.util.LinkedHashMap;
import java.util.Map;
 

public class LRUCache  extends LinkedHashMap<Integer,Integer>{

	    int capacity;
	    // @param capacity, an integer
	    public   LRUCache(int capacity) {
	       super(capacity, 1.0f, true);  
	       this.capacity=capacity;
	       
	    }

	    // @return an integer
	   public int get(int key) {
	        if (super.containsKey(key)){
	            return (int)super.get(key);
	        }else{
	            return -1;
	        }
	    }

	    // @param key, an integer
	    // @param value, an integer
	    // @return nothing
	    public void set(int key, int value) {
	        super.put(key,value);
	    }
	    
	    protected  boolean removeEldestEntry(Map.Entry eldest){
	        return (size()> this.capacity);
	    }
	    
	    public static void main(String[] args){
	    	LRUCache cache=new LRUCache(2);
	    }
	}

