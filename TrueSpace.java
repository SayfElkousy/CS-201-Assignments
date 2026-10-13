import java.util.ArrayList;
public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
         // fill in code here
        
        long cl = clusterSize;
        long total = 0;
        for (int size : sizes){
        long clusterneed = 0;
        clusterneed = (size + cl - 1)/clusterSize;
        total += clusterneed * clusterSize;
        }
    return total;

   }
}