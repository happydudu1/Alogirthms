package IntegerArray;

public class majorityElmentI {
	   public int majorityElement(int[] nums) {
	        if (nums.length==0) return 0;
	        if (nums.length<=2) return nums[0];
	        int maj_idx=0;
	        int count=1;
	        for(int i=1;i<nums.length;i++){
	            if (nums[maj_idx]==nums[i]){
	                count++;
	                if (count>nums.length/2) return nums[maj_idx];
	            }else{
	                count--;
	            }
	            if (count==0){
	                maj_idx=i;
	                count=1;
	            }
	        }
	        return nums[maj_idx];
	    }
}
