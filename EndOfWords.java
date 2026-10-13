import java.util.*;
public class EndOfWords {

    public String[] filter(String[] words){
          // TODO: write code here
        ArrayList<String> order = new ArrayList<>();
        ArrayList<Character> usedCharacters = new ArrayList<>();

        String newword = "";
        for(int i =0; i<words.length; i++){
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length()-1);
            
            if(first == last && !usedCharacters.contains(first)){
                usedCharacters.add(first);
                order.add(words[i]);
            }

        }
        String[] now = order.toArray(new String[0]);
          return now;
      }
    // can create a method that only gets the first and last lettter or removes all the letters in between then puts original word in the list
    // if the do letter value is already in the list then dont do anything.
    // use the .length method-1 to get the last index of the word


}
