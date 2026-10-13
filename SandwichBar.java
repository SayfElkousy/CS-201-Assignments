   import java.util.HashSet;
   import java.util.Arrays;
   public class SandwichBar {
       public int whichOrder(String[] available,
                             String[] orders){
         // fill in code here
         // Might use the value of the index from the list, using the getIndex method to compare which one he likes better since order matters
         // iterate through the char values of a string and if it has a space ' ' then you need to use the .split('') method
         // have to ignore duplicates so hashset might be useful
         // split the strings then put them into hashset

        HashSet<String> currentorder = new HashSet<>();
        HashSet<String> availableSet = new HashSet<>(Arrays.asList(available));

        for(int order = 0; order < orders.length; order++){
            currentorder.clear();
            boolean check = true;

            String[] split = orders[order].split(" ");
            for (String s : split){
                currentorder.add(s);
            }
        // at this point, the order is divided into ingredients and placed into a hashset to remove dups
            
        
            for(String c : currentorder){
                if(! availableSet.contains(c)){
                    check = false;
                }
                
            }
             if((check == true)){
                return order;
            }
                
            }
            return -1;
            }
            

            
        }