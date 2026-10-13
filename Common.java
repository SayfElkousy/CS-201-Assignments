

public class Common {
     public int count(String a, String b){
      int[] list1 = new int[26];
      int[] list2 = new int[26];

      int counter = 0;
      int minimum = 0;

      char letter1;
      int index1 = 0;

      char letter2;
      int index2 = 0;

        for (int l = 0; l < a.length(); l++){
            letter1 = a.charAt(l);
            index1 = letter1 - 'a';

            list1[index1]++;
        }
        for(int j =0; j<b.length(); j++){
            letter2 = b.charAt(j);
            index2 = letter2 - 'a';

            list2[index2] ++;
        }
        for(int c = 0; c < 26; c++){
            minimum = Math.min(list1[c], list2[c]);
            counter += minimum;
        }
        return counter;
     }
}

