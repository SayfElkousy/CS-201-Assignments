public class Totality {
    public int sum(int[] a, String stype) {
         // you add code here
        int counter = 0;
        if(stype.equals("odd")){
            for(int i = 1; i < a.length; i+=2){
                counter = counter + a[i];
            }
        }       
        if(stype.equals("even")){
            for(int i = 0; i < a.length; i+=2){
                counter = counter + a[i];
            }
        }
        if(stype.equals("all")){
            for(int i=0; i < a.length; i++){
                counter = counter + a[i];
            }
        }
         return counter;
     }
}
