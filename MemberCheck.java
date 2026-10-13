import java.util.*;

public class MemberCheck {
      public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
             // TODO: fill in code here
            HashSet<String> first = new HashSet<String>(Arrays.asList(club1));
            HashSet<String> second = new HashSet<String>(Arrays.asList(club2));
            HashSet<String> third = new HashSet<String>(Arrays.asList(club3));

            HashMap<String, Integer> map = new HashMap<>();

            List<String> last = new ArrayList<>();

             for (String name : first) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

            for (String name : second) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

            for (String name : third) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue() > 1){
                    last.add(entry.getKey());
                }
            }
            String[] result;
            result = last.toArray(new String[0]);
            Arrays.sort(result);
            
            return result;

            
      }
   }
