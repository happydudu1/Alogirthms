import java.util.ArrayList;
import java.util.List;


public class test2 {
 public static void main(String[] args){
	 List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");

		for (String s1 : list1) {
			if (s1.equals("B")) {
				list1.remove(s1);
			}
		}
 }
}
