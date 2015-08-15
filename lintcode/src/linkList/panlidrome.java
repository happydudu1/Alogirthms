package linkList;

public class panlidrome {
	  public static int getLen(ListNode head){
	        int len=1;
	        while(head.next!=null){
	            head=head.next;
	            len++;
	        }
	        return len;
	    }
	     public static boolean isPalindrome(ListNode head) {
	        if (head==null||head.next==null) return true;
	        int len=getLen(head);
	        int mid=len/2;
	        int l=1; 
	       ListNode pre=null; 
	       ListNode cur=head;
	       ListNode next=head;
	        while(l<=mid){
	             next=cur.next;
	             cur.next=pre;
	 	         pre=cur;
	             cur=next;
	             l++;
	        }
	        if (len%2==1){
		    cur=cur.next;
	       }
	       while(pre!=null&&cur!=null){
			   if (pre.val==cur.val){
			       pre=pre.next; cur=cur.next;
			   }else{return false;}      
	       }
	       return true;
	       
	    }
	     
	     public static void main(String[] args){
	    	 ListNode a=new ListNode(1);
	    	 ListNode b=new ListNode(2);
	    	 a.next=b;
	    	 System.out.println(isPalindrome(a));
	     }
}
