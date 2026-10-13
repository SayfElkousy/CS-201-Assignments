

public class AccessLevel {
   public String canAccess(int[] rights, int minPermission) {
         // fill in code here
        String name = "";
         for(int i=0;i< rights.length; i++){
            if(rights[i] < minPermission){
                name = name + "D";
            }
            if(rights[i] >= minPermission){
                name = name + "A";
            }
         }
         return name;
     }

}

