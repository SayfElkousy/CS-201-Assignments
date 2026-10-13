import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {
         // replace this code
         ArrayList<String> counter = new ArrayList<>();

         for(int i = 0; i < words.length; i++){
            if(words[i].charAt(0) == first.charAt(0) && ! counter.contains(words[i])){
                counter.add(words[i]);
            }
         }
         return counter.size();
     }
}
