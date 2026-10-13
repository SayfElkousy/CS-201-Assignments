import java.util.*;
  public class HeavyChar {
      public String[] weight(String[] words,String letter, int minChars){
          // write code below, don't return  null
          ArrayList<String> newlist = new ArrayList<>();

          for(int i =0; i < words.length; i++){
            int count = 0;
            for(int c = 0; c < words[i].length(); c++){
                if(words[i].charAt(c) == letter.charAt(0)){
                    count +=1;
                }
            }
            if(count > minChars){
                newlist.add(words[i]);
            }
          }
          String[] converted = newlist.toArray(new String[0]);
          return converted;
      }
  }
