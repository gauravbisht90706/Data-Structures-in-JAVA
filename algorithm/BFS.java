package algorithm;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	
	public void breadthFirstSearch(int graph[][],int source) {
		boolean visited[] = new boolean[graph.length];
		for(int i=0;i<visited.length;i++) {
			visited[i] = false;
		}
		Queue<Integer>q = new LinkedList<>();
		visited[source] = true;
		q.add(source);
		int x;
		
		while(!q.isEmpty()) {
			x= q.remove();
			System.out.println(x);
			
			for(int i=0;i<graph.length;i++) {
				if(graph[x][i]!=0 && !visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of vertices");
		int num = s.nextInt();
		int adj[][] = new int[num][num];
		System.out.println("enter the adjacency matrix");
		for(int i = 0;i < num;i++) {
			for(int j=0;j< num;j++) {
				adj[i][j] =s.nextInt(); 
			}
		}
		System.out.println("enter the source vertex");
		int source = s.nextInt();
		
		BFS b = new BFS();
	    b.breadthFirstSearch(adj, source);
	}

}
