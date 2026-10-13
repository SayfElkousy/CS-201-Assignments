 import java.util.*;
 public class AlphaLength {
      public ListNode create (String[] words) {
        HashSet<String> removing = new HashSet<>(Arrays.asList(words));
        words = removing.toArray(new String[0]);
        Arrays.sort(words);
        ListNode head = null;
        ListNode tail = null;


        for(String w : words){
            ListNode node = new ListNode(w.length());
            if(head == null){
                head = node;
            }
            else{
                tail.next = node;
            }
            tail = node;
        }
          // replace statement below with code you write

	  return head;
      }
  }
