package linkList;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class mergeKLists {
    public Comparator<ListNode> listComparator=new Comparator<ListNode>(){
        public int compare(ListNode l1,ListNode l2){
            return l1.val-l2.val;
        }  
   };
   public ListNode mergeKLists(ListNode[] lists) {
       if (lists.length==0) return null;
       Queue<ListNode> q=new PriorityQueue<ListNode>(lists.length,listComparator);
       for(int i=0;i<lists.length;i++){
           if (lists[i]!=null){
               q.add(lists[i]);
           }
       }
       ListNode pre=new ListNode(0);
       ListNode head=pre;
       while(!q.isEmpty()){
           ListNode tmp=q.poll();
           head.next=tmp;
           tmp=tmp.next;
           head=head.next;
           head.next=null;
           if (tmp!=null){
               q.add(tmp);
           }
       }
       return pre.next;
   }
}
