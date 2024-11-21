package com.demo.Day10;

import java.util.*;

public class GraphMain {
    private Map<Integer, List<Integer>> adjList;

    public void Graph() {
        adjList = new HashMap<>();
    }

    // Method to add an edge to the graph
    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);  // For undirected graph
    }

    // Method to detect cycle in an undirected graph using DFS
    public boolean detectCycle() {
        Set<Integer> visited = new HashSet<>();
        
        // Call DFS for every unvisited node to ensure we cover all components
        for (Integer node : adjList.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(node, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper method to detect cycle
    private boolean dfs(int node, Set<Integer> visited, int parent) {
        visited.add(node);

        // Recur for all the adjacent vertices
        for (int neighbor : adjList.get(node)) {
            // If the neighbor is not visited, then recur
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, visited, node)) {
                    return true;
                }
            }
            // If an adjacent vertex is visited and is not the parent of the current vertex, there is a cycle
            else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graphmain = new Graph();

        System.out.println("Enter the number of vertices in the graph:");
        @SuppressWarnings("unused")
		int vertices = sc.nextInt();

        System.out.println("Enter the number of edges in the graph:");
        int edges = sc.nextInt();

        System.out.println("Enter the edges (u v) where u and v are vertices connected by an edge:");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graphmain.addEdge(u, v);
        }

        // Detect cycle in the graph
        if (graphmain.detectCycle()) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }

        sc.close();
    }
}

