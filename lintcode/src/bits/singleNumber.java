package bits;

public class singleNumber {
	public static int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		int n = A[0];
		System.out.println(n);
		for(int i = 1; i < A.length; i++) {
			System.out.println(n);
			n = n ^ A[i];
			System.out.println(n);
		}

		return n;
	}
	
	public static void main(String[] args){
		int[] a={1,3,5,2,2,1,3};
		singleNumber(a);
	}
}
