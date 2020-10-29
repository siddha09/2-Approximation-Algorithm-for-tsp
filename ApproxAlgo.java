package travelling_salesman_problem;
import java.util.Arrays;

public class ApproxAlgo {
   static void Prim(int G[][], int V) {
    int INF = 9999999;
    int no_edge; 
    boolean[] selected = new boolean[V];
    Arrays.fill(selected, false);
    no_edge = 0;
    selected[0] = true;
    System.out.println("Edge : Weight");

    while (no_edge < V - 1) {
      int min = INF;
      int x = 0; 
      int y = 0; 

      for (int i = 0; i < V; i++) {
        if (selected[i] == true) {
          for (int j = 0; j < V; j++) {
            if (!selected[j] && G[i][j] != 0) {
              if (min > G[i][j]) {
                min = G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
      System.out.println(x+1 + " -> " + (y+1) + " :  " + G[x][y]);  
      selected[y] = true;
      
      no_edge++;
    }
  }
}
