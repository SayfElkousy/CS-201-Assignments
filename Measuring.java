import java.util.HashMap;

public class Measuring {
    public int[] calculate(String[] data) {
        HashMap<String,Integer> map = new HashMap<>();
        // write code below, don't return  null
        int[] lengths = new int[data.length];

        for(int i = 0; i < data.length; i++){
            map.putIfAbsent(data[i], data[i].length());
        }
        for(int a = 0; a < lengths.length; a++){
            lengths[a] = map.get(data[a]);
            if(map.get(data[a]) != 0){
                map.put(data[a],0);
            }
        }

        return lengths;
      }
  }
