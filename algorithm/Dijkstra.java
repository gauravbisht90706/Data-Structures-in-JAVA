package algorithm;

import java.util.Scanner;

public class Dijkstra {

	public void source_dis(int graph[][],int source){
		int count = graph.length;
		boolean visited[] = new boolean[count];
		int distance[] = new int[count];
		for(int i=0;i<count;i++) {
			visited[i] = false;
			distance[i] = Integer.MAX_VALUE;
		}
		
		distance[source] = 0;
		for(int i = 0;i<count;i++) {
			int u = findMinDistance(distance, visited);
			visited[u] = true;
			for(int v = 0; v< count;v++) {
				if(!visited[v] && graph[u][v]!=0 && (distance[u]+graph[u][v] < distance[v]) ) {
					distance[v] = distance[u]+graph[u][v];
					
				}
			}
		}
		for(int i = 0;i < count;i++) {
			System.out.println("Minimum distance from source to destination is " +source+ "-->" +i+ "=" +distance[i] );
		}
		
		
		
		
	}
	public static int findMinDistance(int distance[], boolean visited[]) {
		int minVertex = -1;
		int minDistance = Integer.MAX_VALUE;
		for(int i = 0; i < distance.length;i++) {
			if(!visited[i] && distance[i] < minDistance) {
				minDistance = distance[i];
				minVertex = i;
			}
		}
		return minVertex;
	}



	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("enter the number of vertices");
		int nodes = s.nextInt();
		int graph[][] = new int[nodes][nodes];
		System.out.println("enter the matrix");
		for(int i=0;i<nodes;i++) {
			for(int j=0;j<nodes;j++) {
				graph[i][i] = s.nextInt();
				
			}
		}
		Dijkstra d = new Dijkstra();
		d.source_dis(graph,0);
		}

}
