import java.util.*;

public class SplitCount {
    public String counter(String[] info) {
          // write code below, don't return  ""
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i< info.length; i++){
            String[] current = info[i].split(":");
            map.put(current[0],map.getOrDefault(current[0],0)+1);
            map.put(current[1],map.getOrDefault(current[1],0)+1);
        }
        int max = 0;
        String maxstring = "";
        for(String key : map.keySet()){
            int value = map.get(key);
            if(value > max){
                max = value;
                maxstring = key;
            }
        }


        return maxstring;
    }
}