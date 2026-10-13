public class Anonymous {
    public boolean checkmessage(int[] list,String m){
        int[] messagechar = new int[26];
        for(int a = 0; a < m.length(); a++){
            char f = m.charAt(a);
            if(f != ' '){
                messagechar[f - 'a']++;
                if(messagechar[f-'a'] > list[f-'a']){
                return false;
            }
        }
    }
        return true;
    }
    
    public int howMany(String[] headlines, String[] messages) {
        // fill in code here
        int[] letterbank = new int[26];
        int counter = 0;

            for(String p : headlines){
            String s = p.toLowerCase();
                for(int i = 0; i < s.length(); i++){
                    char c = s.charAt(i);
                    if(c != ' '){
                        letterbank[c-'a'] ++;
                    }
                }
            }
            for(String n : messages){
                String m = n.toLowerCase();
                if(checkmessage(letterbank, m) == true){
                    counter += 1;
                }

            }

            return counter;
      }
   }
