import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

  

class ValueComparator implements Comparator<String> {
	 
    Map<String, Integer> base;
 
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
 
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}

class MutableInteger {
	 
	private int val;
 
	public MutableInteger(int val) {
		this.val = val;
	}
 
	public int get() {
		return val;
	}
 
	public void set(int val) {
		this.val = val;
	}
 
	//used to print value convinently
	public String toString(){
		return Integer.toString(val);
	}
}
public class test {
  public static void main(String[] args){
	  double a=123e-001;
	  double a1=123e-1;
	  System.out.println(a);
	  System.out.println(a1);
	  
	  String x="a";
	  change(x);
	  System.out.println(x);
	  
	 
	  
	  StringBuilder x2=new StringBuilder("a");
	  change2(x2);
	  System.out.println(x2);
	  
	  int[] arr={1,2,3};
	  System.out.println(arr);
	  changeArray(arr);
	  for(int i:arr){
		  System.out.println(i);
	  }
	  System.out.println(arr);
	  
	  
	  ArrayList<Integer> list=new ArrayList<Integer>();
	  list.add(2);
	  list.add(3);
	  changeArrayList(list);
	  System.out.println(list);
 
	  System.out.println( String.format("An integer: %d and a string: %s", 5, "ab", a));
	  
	  String s = "one two three two three three";
	  String[] sArr = s.split(" ");
	  
	  /*	  HashMap<String, MutableInteger> efficientCounter = new HashMap<String, MutableInteger>();
	  
	  for (String a11 : sArr) {
	  	MutableInteger initValue = new MutableInteger(1);
	  	MutableInteger oldValue = efficientCounter.put(a11, initValue);
	   // System.out.println(a11+ ": "+ oldValue.get());
	  	if(oldValue != null){
	  		System.out.println(a11+ ": "+ oldValue.get());
	  		initValue.set(oldValue.get() + 1);
	  	}else{
	  		System.out.println(a11+ " is null 1");
	  		System.out.println(efficientCounter.get(a11));
	  	}
	  }*/
/*	  HashMap<String, Integer> countMap = new HashMap<String, Integer>();
	//add a lot of entries
	countMap.put("a", 10);
	countMap.put("b", 20);
	 
	ValueComparator vc =  new ValueComparator(countMap);
	TreeMap<String,Integer> sortedMap = new TreeMap<String,Integer>(vc);
	 
	sortedMap.putAll(countMap);  
	 
	printMap(sortedMap);
*/	  
	
	List<String> list1 = new ArrayList<String>();
	list1.add("A");
	list1.add("B");

	for (String s1 : list1) {
		if (s1.equals("B")) {
			list1.remove(s1);
		}
	}
  }
  
  public static void change(String x){
	  x+="b";
  }
  
  public static void change2(StringBuilder x){
	  x=new StringBuilder("b");
	  //x.replace(0, 1,"B");
  }
  
  public static void changeArray(int[] arr){ 
	 arr=new int[2];
	  for(int i:arr){
		  System.out.println(i);
	  }
  }
  
  
  public static void changeArrayList(ArrayList<Integer> arr){ 
		 arr.add(1);
		 arr=new ArrayList<Integer>(2);
		 System.out.println(arr);
  }
  
  public static void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        System.out.println(pairs.getKey() + " = " + pairs.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
}
