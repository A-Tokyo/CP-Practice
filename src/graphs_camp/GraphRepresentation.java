package graphs_camp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Try to test the implementation with some input of your choice
public class GraphRepresentation {

	
	static int[][] adjMat;
	static ArrayList<Pair>[] adjList;
	static Triple[] edgeList;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		
		adjMat = new int[n][n];
		
		adjList = new ArrayList[n];
		for(int i = 0; i < n; ++i)
			adjList[i] = new ArrayList<Pair>();
		
		edgeList = new Triple[n];
		
		for(int i = 0; i < m; ++i)
		{
			int u = sc.nextInt(), v = sc.nextInt(), cost = sc.nextInt();
			
			adjMat[u][v] = cost;		//undirected?? multigraph??
			
			adjList[u].add(new Pair(v, cost));
			
			edgeList[i] = new Triple(u, v, cost);
		}
	}
	
	
	static class Pair
	{
		int to, cost;
		
		Pair(int a, int b) { to = a; cost = b; }
	}
	
	static class Triple
	{
		int from, to, cost;
		
		Triple(int a, int b, int c) { from = a; to = b; cost = c; }
	}
	
}
