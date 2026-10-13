
public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
            // fill in code here
            // Need to count how many of the nuc character are in the String for each in the list
            // If two Strings in the list have the same number of count in the character, then choose the one with the greater .length
            
            int bestcount = -1;
            String bestString = "";

            for(String current : strands ){
                int currentcount = 0;

                for(int c = 0; c<current.length(); c++){
                    if(current.charAt(c) == nuc.charAt(0)){
                        currentcount+=1;
                    }
                }
                if(currentcount > bestcount || (currentcount == bestcount && current.length() > bestString.length())){
                    bestcount = currentcount;
                    bestString = current;
                }
        }
        if(bestcount == 0){
            return "";
        }
        else{
            return bestString;
        }
    }
}
