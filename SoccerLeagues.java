import java.util.HashMap;

public class SoccerLeagues {
    //Each word i will give the wins for the jth character 
   public int[] points(String[] matches) {
         // you write code here
         int[] results = new int[matches.length];

         HashMap<Integer, Integer > map = new HashMap<>();

         for(int i = 0; i < matches.length; i++){
            for(int j = 0; j< matches[i].length(); j++){
                if(matches[i].charAt(j) == 'W'){
                    map.put(i,map.getOrDefault(i,0)+3);
                    map.put(j,map.getOrDefault(j,0));
                }
                if(matches[i].charAt(j) == 'D'){
                    map.put(i,map.getOrDefault(i,0)+1);
                    map.put(j,map.getOrDefault(j,0)+1);
                }
                if(matches[i].charAt(j) == 'L'){
                    map.put(j,map.getOrDefault(j,0)+3);
                    map.put(i,map.getOrDefault(i,0));

                
                }
            }
         }
         for(int a =0; a < matches.length; a++){
            results[a] = map.get(a);
         }

         return results;
     }
}
