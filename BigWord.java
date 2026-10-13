import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BigWord {
    HashMap<String,Integer> map = new HashMap<>();   

    public void counting(String input){
    List<String> splitting = Arrays.asList(input.split(" "));
    String c = null;
    for(String s : splitting){
        c = s.toLowerCase();
        map.put(c,map.getOrDefault(a,0)+1);
    }

    }
      public String most(String[] sentences) {
          // you write code heref
          // Going to need to use .toLowerCase method 
          // use to lower case method first then add it to the hashmap
        String lowercase = null;
        for(int a = 0; a < sentences.length; a++){
            lowercase = sentences[a];
            counting(lowercase);
        }
        String finalword = null;
        int greatestvalue = 0;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue() > greatestvalue){
                greatestvalue = entry.getValue();
                finalword = entry.getKey();
            }
        }
        return finalword;
      }
  }
