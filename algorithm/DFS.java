package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class DFS {

	public void graph(int graph[][], int source) {
		boolean visited[] = new boolean[graph.length];
		for (int j = 0; j < visited.length; j++) {
			visited[j] = false;
		}
		Stack<Integer> stack = new Stack();
		stack.push(source);
		visited[source] = true;
		int i;
		while (!stack.isEmpty()) {
			i = stack.pop();
			System.out.println(i);
			for (int j = 0; j < graph.length; j++) {

				if (graph[i][j] != 0 && !visited[j]) {
					stack.push(j);
					visited[j] = true;

				}

			}

		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of vertices");
		int num = s.nextInt();
		System.out.println("enter the adjacency matrix");
		int adj[][] = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				adj[i][j] = s.nextInt();
			}
		}
		System.out.println("enter the source vertex");
		int source = s.nextInt();
		DFS g = new DFS();
		g.graph(adj, source);

	}

}
