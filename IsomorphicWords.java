import java.util.*;

public class IsomorphicWords {
      public String convert(String word){
         HashMap<Character,Integer> map = new HashMap<>();
         String builder = "";
         int nextId = 0;
         for(int i = 0; i < word.length();i++){
            if(!map.containsKey(word.charAt(i))){
               map.put(word.charAt(i),nextId);
               nextId++;
            }
            builder += map.get(word.charAt(i));
         }
         return builder;


      }

      public int countPairs(String[] words) {
         HashMap<String,Integer> map = new HashMap<>();

         for(int w = 0; w < words.length; w++){
            String c = convert(words[w]);
            map.put(c,map.getOrDefault(c,0)+1);
         }
         int pairs = 0;
         for(int count : map.values()){
            pairs += count * (count-1)/2;
         }
         return pairs;

         // fill in code here
      }
   }
