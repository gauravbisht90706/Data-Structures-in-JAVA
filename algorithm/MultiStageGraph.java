package algorithm;

import java.util.Scanner;

public class MultiStageGraph {
	
	public  MultiStageGraph(int graph[][], int num) {
		int dist[] = new int[num];
		int path[] = new int[num];
		
		
		for(int i=0;i<num;i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[num-1] = 0;
		path[num-1] = num;
		
		for(int i = num-2;i>=0;i--) {
			for(int j=i+1;j<num;j++) {
				if(graph[i][j]==0) {
					continue;
				}
				else {
					dist[i] = Math.min(dist[i], graph[i][j]+dist[j]);
					path[i] = j;
				}
			}
			
		}
		int p = path[0];
		System.out.print("Path is from :- " +0);
		while(p != num ) {
			System.out.print(" => " +p);
			p = path[p];
		}
		System.out.println();
		System.out.println("shortest distance cost is : " +dist[0]);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of vertices in the graph");
		int num = s.nextInt();
		int graph[][] = new int[num][num];
		System.out.println("enter the adjacency matrix of the graph");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				graph[i][j] = s.nextInt();
			}
		}
		MultiStageGraph ob = new MultiStageGraph(graph, num);

	}

}
