import java.util.*;
public class Encryption {
public String encrypt(String message){
           // you write code here
        HashMap<Character,Character> decipher = new HashMap<>();
        String laststring = "";
        char l = 'a';
        for(int i = 0; i < message.length(); i++){
            if(!decipher.containsKey(message.charAt(i))){
                decipher.put(message.charAt(i),l);
                l++;
            }
            laststring += decipher.get(message.charAt(i));
        }
          return laststring;  
            
        }

    }

