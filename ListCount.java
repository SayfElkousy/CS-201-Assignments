public class ListCount {
      public int count (ListNode list) {
          // replace statement below with code you write
        ListNode current = list;
        int nodecount = 0;
        while (current != null){
            nodecount += 1;
            current = current.next;
        }
	  return nodecount;
      }
  }

