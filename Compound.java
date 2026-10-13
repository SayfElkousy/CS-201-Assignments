import java.util.HashMap;

public class Compound {
    public int getWeight(String comp, String atomics) {
        // create a string list to loop through with .split(, )
        // create a string list to loop 
        /* Helpful Hints: You may find static boolean methods Character.isDigit and/or Character.isAlphabetic useful. For example, Character.isDigit(ch) is true for ch == '1' (or '2', ..., '9') and is false for ch == 'C' (or 'H','B', 'O',...'I').
The static method Integer.parseInt may be useful too. It takes a String parameter and returns the int equivalent, e.g, Integer.parseInt("9") == 9.

If char ch = 'g' then ""+ch is the String "g". */
        String[] separate = atomics.split(",");
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < separate.length; i++){
            char c = 'a';
            String integerbuilder = "";
            int in = 0;
            String current = separate[i];
            int convertinteger;
            for(int a = 0; a < current.length(); a++){
                if(Character.isAlphabetic(current.charAt(a)) && current.charAt(a) != ':'){
                    c = current.charAt(a);
                }
                if(Character.isDigit(current.charAt(a)) && current.charAt(a) != ':'){
                    integerbuilder += current.charAt(a);
                }
            }
            convertinteger = Integer.parseInt(integerbuilder);
            map.put(c,convertinteger);
        }

        int count = 0;
        for(int co = 0; co<comp.length(); co++){
            if(Character.isAlphabetic(comp.charAt(co))){
                if(co + 1 < comp.length() && Character.isDigit(comp.charAt(co+1))){
                    int ninteger = Integer.parseInt(comp.charAt(co+1)+ "");
                    count += map.get(comp.charAt(co)) * ninteger;
                    co++;
                }
                else{
                    count += map.get(comp.charAt(co));
                }

            }
        }
          // TODO write code here
          return count;
      }  
}
