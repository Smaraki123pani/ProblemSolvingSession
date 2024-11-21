package com.demo.Day10;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Method to add an edge to the graph
    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);  // Assuming an undirected graph
    }

    // Depth-First Search (DFS)
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsUtil(start, visited);
    }

    private void dfsUtil(int node, Set<Integer> visited) {
        // Mark the current node as visited and print it
        visited.add(node);
        System.out.print(node + " ");

        // Recur for all the adjacent vertices of the node
        for (int neighbor : adjList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // Breadth-First Search (BFS)
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        // Mark the start node as visited and enqueue it
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            int node = queue.poll();
            System.out.print(node + " ");

            // Enqueue all the adjacent vertices of the dequeued node
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // Main method to run DFS and BFS using the Scanner class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.println("Enter the number of vertices in the graph:");
        @SuppressWarnings("unused")
		int vertices = sc.nextInt();

        System.out.println("Enter the number of edges in the graph:");
        int edges = sc.nextInt();

        System.out.println("Enter the edges (u v) where u and v are vertices connected by an edge:");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        System.out.println("Enter the starting node for DFS:");
        int startDFS = sc.nextInt();
        System.out.print("DFS Traversal starting from node " + startDFS + ": ");
        graph.dfs(startDFS);
        System.out.println();

        System.out.println("Enter the starting node for BFS:");
        int startBFS = sc.nextInt();
        System.out.print("BFS Traversal starting from node " + startBFS + ": ");
        graph.bfs(startBFS);
        sc.close();
    }

	public boolean detectCycle() {
		 Set<Integer> visited = new HashSet<>();
	        
	        // Call DFS for every unvisited node to ensure we cover all components
	        for (Integer node : adjList.keySet()) {
	            if (!visited.contains(node)) {
	            }
	        }
	        return false;
	}

}

