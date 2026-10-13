import java.util.*;
  public class MergeLists {
      public ListNode weave (ListNode a, ListNode b) {
        ListNode first = a;
        ListNode second = b;
        ListNode head = null;

        while(a != null && b != null){
            if(a.info > b.info){
                head = first;
                head = head.next;
                head = second;
            }
            else{
                head = second;
                head = head.next;
                head = first;
            }
            head = head.next;
            first = first.next;
            second = second.next;
            
        }
          // replace statement below with code you write
	  return head;
      }
  }
