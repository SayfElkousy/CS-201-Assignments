
public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // replace statement below with code you write
        ListNode first = a1;
        ListNode second = a2;

        while(first != null && second != null){
            if(first.info != second.info){
                return 0;
            }
            first = first.next;
            second = second.next;
            
        }
        if(first== null && second == null){
            return 1;
        }

	return 0;
    }
  }
