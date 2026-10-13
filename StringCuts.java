import java.util.Set;
import java.util.LinkedHashSet;
public class StringCuts {
     public String[] filter(String[] list, int minLength) {
         // replace this with your code
        Set<String> newlist = new LinkedHashSet<>();

        for(String l : list){
            if(l.length() >= minLength){
                newlist.add(l);
            }
        }
        String[] output = newlist.toArray(new String[0]);
        return output;
     }
     
 }

 