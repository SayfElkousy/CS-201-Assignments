public class PrefixCode { 
      public String isOne(String[] words) {
        for( int w = 0; w < words.length; w++){
            for(int i =0; i < words.length; i++){
                if(i != w && words[i].startsWith(words[w])){
                    return "No, " + w;
                }
            }
        }
        return "Yes";
          // fill in body of this function
      }
   }