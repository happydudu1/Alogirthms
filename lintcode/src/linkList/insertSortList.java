package linkList;

public class insertSortList {
	 public static ListNode insertionSortList(ListNode head) {
	        if (head==null||head.next==null) return head;
	        ListNode pre=new ListNode(0);
	        pre.next=head;
	        ListNode curr=head;
	       // ListNode tail=curr;
	        while(curr!=null){
	            ListNode nextHead=curr;
	            nextHead=curr.next;
	            if (head==curr){ 
	                curr.next=null;
	            }else{
	                
	                ListNode temp=pre; 
	                if (head.val>=curr.val){
	                	curr.next=pre.next;
	                    pre.next=curr;
	                    
	                    head=curr;
	                }else{
	                    while(temp.next!=null&&temp.next.val<curr.val){
	                        temp=temp.next;
	                    } 
	                    if (temp.next==null){
	                        
	                        temp.next=curr;
	                        curr.next=null;
	                    }else{ 
	                        
	                        curr.next=temp.next;
	                        temp.next=curr;
	                        
	                    }      
	                } 
	            }
	            curr=nextHead;
	        }
	        return pre.next;
	    }
	 
	 public static void main(String[] args){
		 ListNode a=new ListNode(4);
		 ListNode b=new ListNode(2);
		 ListNode c=new ListNode(1);
		 ListNode d=new ListNode(3);
		 a.next=b;
		 b.next=c;
		 c.next=d;
		 insertionSortList(a);
	 }
}
