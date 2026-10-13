import java.util.ArrayList;

public class Between {
      public String[] sandwiched(String[] words, int low, int high) {
          // you write code here
          ArrayList<String> qualify = new ArrayList<>();
          for (String word : words){
            if(low <= word.length() && word.length()<= high){
                qualify.add(word);
            }
          }
          String[] qualifyList = qualify.toArray(new String[0]);
          return qualifyList;
      }
  }
