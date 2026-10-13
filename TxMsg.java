public class TxMsg {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    
    
    private boolean modify(String wor){
        boolean isVow = false;
        boolean wordconsonant = false;
         for(int w = 0; w < wor.length(); w++){
            isVow = false;
            for(char v : vowels){
                if(wor.charAt(w) == v){
                    isVow = true;
                }
            }
            if(isVow == false){
                wordconsonant = true;
            } 
    }
    return wordconsonant;
}

    private String filter(String word){
        boolean isVowel = false;
        boolean letterbefore = false;
        String eachword = "";
        boolean check = modify(word);

        if(check == false){
            return word;
        }

        for(int w = 0; w < word.length(); w++){
            isVowel = false;
            for(char v : vowels){
                if(word.charAt(w) == v){
                    isVowel = true;
                }
            }
            if(isVowel == false){
                if(letterbefore == false){
                    eachword += word.charAt(w);
                }
                letterbefore = true;
            }
            if(isVowel == true){
                letterbefore = false;
            }
        }
        return eachword;
}
    public String getMessage(String original) {
    // make a boolean variable that becomes true if the word contains a vowel
    String[] separate = original.split(" ");
    String output = "";
    for(int i = 0; i<separate.length; i++){
        output += filter(separate[i]);
        if(i < separate.length -1){
            output += " ";
        }
    }

    return output;
            }
    }
