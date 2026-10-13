
import java.util.*;
public class Consensus {
    public String consensus(String[] words){
        // write code here
        HashMap<Integer, List<Character>> lettercount = new HashMap<>();
        String finalword = "";
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                lettercount.put(i,lettercount.getOrDefault(i,new ArrayList<Character>()));
                lettercount.get(i).add(word.charAt(i));
            }
        }
        for(int key : lettercount.keySet()){
            List<Character> value = lettercount.get(key);
            char currentletter = 'a';
            for(char a : value){
                if(Collections.frequency(value, a) > Collections.frequency(value,currentletter)){
                    currentletter = a;
                }
                if(Collections.frequency(value, a) == Collections.frequency(value,currentletter) && a < currentletter){
                    currentletter = a;
                }
                
                }
                finalword += currentletter;
            }
            return finalword;
        }    
    }