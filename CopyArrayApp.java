import java.util.Arrays;
import java.util.ArrayList;
public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    int[] myVals = new int[nVals];
    ArrayList<Integer> uniqueVals = new ArrayList<>();
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      myVals[i] = item;
      if (uniqueVals.contains(item)) {
        continue;
        } else {uniqueVals.add(item);
        } // do nothing given that that is true otherwise add  
      }
    
    System.out.println("original values: " + Arrays.toString(myVals));
    System.out.println("unique values: " + uniqueVals);
  }
}