package IntegerArray;

import java.util.ArrayList;

import java.util.ArrayList;

public class Pascal {
	 public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
         if (triangle.size()==0) return 0;
         if (triangle.size()==1) return triangle.get(0).get(0);
          
         ArrayList<Integer> sol=new ArrayList<Integer>();
         sol.addAll(triangle.get(triangle.size()-1));
         System.out.println( sol);
         for(int i=triangle.size()-2;i>=0;i--){
            for(int j=triangle.get(i).size()-1;j>=0;j--) {
                
                 sol.set(j+1,Math.min(sol.get(j+1),sol.get(j))+triangle.get(i).get(j));
            }
            System.out.println(i+" " +   " " +sol); 
         }
         return sol.get(0);
    }
	 
	 public static void main(String[] args){
		 ArrayList<ArrayList<Integer>> test= new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> l=new ArrayList<Integer>();
		 l.add(-1);
		 test.add(l);
		 ArrayList<Integer> l1=new ArrayList<Integer>();
		 l1.add(2);
		 l1.add(3);
		 test.add(l1);
		 ArrayList<Integer> l2=new ArrayList<Integer>();
		 l2.add(1);
		 l2.add(-1);
		 l2.add(-3);
		 test.add(l2);
		 System.out.println(test);
		 System.out.println(minimumTotal(test));
		 System.out.println(test);
	 }
}
