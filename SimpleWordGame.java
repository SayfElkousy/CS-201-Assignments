import java.util.HashSet;
import java.util.Arrays;

public class SimpleWordGame {
    private int pointsystem(String word){
        return (word.length() * word.length());
    }
    public int points(String[] player, 
                        String[] dictionary) {
        HashSet<String> currentplayer = new HashSet<>(Arrays.asList(player));
        int points = 0;
    
        for(String i : dictionary){
            if(currentplayer.contains(i)){
                    points += pointsystem(i);
            }
        }
        return points;
          // you write code here
      }
}
