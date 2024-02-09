import java.util.*;

public class ChocolaProblem {
   public static void main(String[] args) {
      @SuppressWarnings("unused")
      int n = 4, m = 6;

      Integer costVer[] = { 2, 1, 3, 1, 4 }; // n-1
      Integer costHor[] = { 4, 1, 2 }; // m-1

      Arrays.sort(costVer, Collections.reverseOrder());
      Arrays.sort(costHor, Collections.reverseOrder());

      int hor_cut = 0, ver_cut = 0;
      int hor_pices_count = 1, ver_pices_count = 1;
      int cost = 0;

      while (hor_cut < costHor.length && ver_cut < costVer.length) {
         if (costVer[ver_cut] <= costHor[hor_cut]) { // horizontal cut
            cost += (costHor[hor_cut] * ver_pices_count);
            hor_pices_count++;
            hor_cut++;
         } else {// vertical cut
            cost += (costVer[ver_cut] * hor_pices_count);
            ver_pices_count++;
            ver_cut++;
         }
      }
      while (hor_cut < costHor.length) {
         cost += (costHor[hor_cut] * ver_pices_count);
         hor_pices_count++;
         hor_cut++;
      }
      while (ver_cut < costVer.length) {
         cost += (costVer[ver_cut] * hor_pices_count);
         ver_pices_count++;
         ver_cut++;
      }
      System.out.println("Minimum cost of cuts = " + cost);
   }
}
