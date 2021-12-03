package algorithm;

import java.util.Arrays;
import java.util.Scanner;

class Prims {

  public void Prim(int G[][], int V) {

    int INF = 9999999;

    int no_edge; 

    boolean[] selected = new boolean[V];

    Arrays.fill(selected, false);

    no_edge = 0;

    selected[0] = true;
    
    int cost =0;

    
   

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
                cost = cost+G[i][j];
                x = i;
                y = j;
              }
            }
          }
        }
      }
      System.out.println(x + " - " + y + " :  " + G[x][y]);
      
      selected[y] = true;
      no_edge++;
    }
    System.out.println("the total cost is "+cost);
  }

  public static void main(String[] args) {
	  Scanner s  = new Scanner(System.in);
    Prims g = new Prims();

   
    System.out.println("enter the number of vertices");
    int V = s.nextInt();
    int G[][] = new int[V][V];
    System.out.println("enter the 2D matrix");
    for(int i=0;i<V;i++) {
    	for(int j=0;j<V;j++) {
    		G[i][j] = s.nextInt();
    	}
    }

   
    

    g.Prim(G, V);
  }
}
