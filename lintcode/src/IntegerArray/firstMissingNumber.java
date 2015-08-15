package IntegerArray;

public class firstMissingNumber {
	  public static int findMissing(int[] nums) {
	       if (nums.length==0) return -1;
	       for(int i=0;i<nums.length;i++){
	           while(nums[i]!=i){
	               if (nums[i]<0||nums[i]>=nums.length||nums[i]==nums[nums[i]]){
			             break;
	                }
	                     int temp=nums[i];
	                     nums[i]=nums[nums[i]];
	                     nums[temp]=temp;
	           }
	         }
	       for(int i=0;i<nums.length;i++){
	    	   System.out.print(nums[i]+" ");
	       }
	       for(int i=0;i<nums.length;i++){
		      if (nums[i]!=i){
	                 return i;
	           }
	       }
	       return nums.length;
	    }
	  
	  public static void main(String[] args){
		  int[] test={9,8,7,6,2,0,1,5,4};
		  findMissing(test);
	  }
}
