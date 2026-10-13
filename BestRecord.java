import java.util.*;

public class BestRecord {
      public String best(String[] games) {

        HashMap<String,Integer> record = new HashMap<>();

        String joiner = String.join("-", games);
        String[] splitter = joiner.split("-");
        
        for(int i = 0; i < splitter.length; i++){
            int current = record.getOrDefault(splitter[i], 0);
            if(i % 2 == 0 || i == 0){
                record.put(splitter[i],current+1);
            }
            if(i % 2 != 0){
                record.put(splitter[i],current-1);
            }
        }
        int max = 0;
        String maxstring = "";
        for(String key : record.keySet()){
            if(record.get(key) > max){
                max = record.get(key);
                maxstring = key;
            }
        }
        String connect = maxstring + ":" + max;
          // write code below, don't return  ""
          return connect;
      }
  }
