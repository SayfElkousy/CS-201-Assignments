import java.util.ArrayList;

public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        for(int i =0; i < list.length; i+=2){
            newlist.add(list[i]+list[i+1]);
        }
        int [] convert = newList.toArray(int[0]);
         // change this code
         return convert;
     }
}
