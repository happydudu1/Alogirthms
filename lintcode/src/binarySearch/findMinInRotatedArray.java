package binarySearch;
/*
 * http://bangbingsyb.blogspot.com/2014/11/leecode-find-minimum-in-rotated-sorted.html
 */
public class findMinInRotatedArray {
	 public int findMin(int[] num) {  //Olog(n)
	        if (num.length==0) return 0;
	        int start=0;
	        int last=num.length-1;
	        int mid=0;
	        while(start<last){
	            mid=(start+last)/2;
	        //    if (mid>start&&num[mid]<num[mid-1]) return num[mid];
	            if (num[mid]<num[last]){
	            
	                    last=mid; 
	            }else if (num[mid]>num[last]){
	                 start=mid+1;
	            }
	        }
	        return num[start];
	    }
}
