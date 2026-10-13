import java.util.*;

public class SimpleHash {
      public String[] calculate(String[] list){
          // TODO: write code here
          // Convert characters with int[26]
          // Store sum in HashMap
          //Return hashmap key
        HashMap<Integer, ArrayList<String>>map = new HashMap<>();
        ArrayList<Integer> Hashnumbers = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < list.length; i++){
            String current = list[i];
            int currentSum = 0;
            for(int a = 0; a < current.length(); a++){
                int value = current.charAt(a)-'a'+1;
                currentSum += value;
            }
            if(!map.containsKey(currentSum)){
                map.put(currentSum, new ArrayList<String>());
                Hashnumbers.add(currentSum);
            }
            map.get(currentSum).add(current);
            // at this point, the map has all of the values and their corresponding list of words
        }
        Collections.sort(Hashnumbers);
        for(int b : Hashnumbers){
            if (map.get(b).size() > 2) {
                String separate = String.join(" ", map.get(b));
                String word = b + ":" + separate;
                answer.add(word);
            }
        }
            String[] lists = answer.toArray(new String[0]);

          return lists;
      }
  }