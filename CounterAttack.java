import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class CounterAttack {
     public int[] analyze(String str, String[] words) {
         // change this code
        List<String> splitting = Arrays.asList(str.split(" "));
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : splitting){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int[] counter = new int[words.length];
        int b = 0;
        for(int a =0; a < words.length; a++){
            b = map.getOrDefault(words[a],0);
            counter[a] = b;
        }
        return counter;
     }
 }