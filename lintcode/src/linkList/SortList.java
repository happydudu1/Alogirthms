package linkList;

public class SortList {
	 public static ListNode sortList(ListNode head) {
	        if (head==null||head.next==null) return head;
	        
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast.next!=null&&fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        ListNode next=slow.next;
	        slow.next=null;
	        ListNode l1=head;
	        l1=sortList(l1);
	        ListNode l2=sortList(next);
	        return mergeSort(l1,l2);
	    }
	    
	    public static ListNode mergeSort(ListNode l1, ListNode l2){
	        if (l1==null) return l2;
	        if (l2==null) return l1;
	        ListNode pre=new ListNode(0);
	        ListNode head=pre;
	        while(l1!=null&&l2!=null){
	            if (l1.val<l2.val){
	                head.next=l1;
	                l1=l1.next;
	            }else{
	                head.next=l2;
	                l2=l2.next; 
	            }
	            head=head.next;
	        }
	        if (l1==null){
	            head.next=l2;
	        }else{
	            head.next=l1;
	        }
	        return pre.next;
	    }
	    
	    public static void main(String[] args){
	    	ListNode l=new ListNode(2);
	    	ListNode l2=new ListNode(1);
	    	l.next=l2;
	    	ListNode res= sortList(l);
	    }
}
