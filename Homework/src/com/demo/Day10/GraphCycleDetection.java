// 1. Create a program to detect a cycle in a directed graph.

package com.demo.Day10;

import java.util.*;

public class GraphCycleDetection {
    // Class to represent a directed graph
    static class Graph {
        private int vertices;
        private List<List<Integer>> adjList;

        // Constructor
        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        // Add an edge from node u to node v
        public void addEdge(int u, int v) {
            adjList.get(u).add(v);
        }

        // DFS function to detect cycle
        private boolean dfs(int node, boolean[] visited, boolean[] recursionStack) {
            // If node is already in the recursion stack, we found a cycle
            if (recursionStack[node]) {
                return true;
            }

            // If node is already visited and not in the recursion stack, no cycle here
            if (visited[node]) {
                return false;
            }

            // Mark the node as visited and part of the current recursion stack
            visited[node] = true;
            recursionStack[node] = true;

            // Recur for all adjacent nodes
            for (int neighbor : adjList.get(node)) {
                if (dfs(neighbor, visited, recursionStack)) {
                    return true;
                }
            }

            // Backtrack: remove the node from the recursion stack
            recursionStack[node] = false;
            return false;
        }

        // Function to check if the graph contains a cycle
        public boolean hasCycle() {
            boolean[] visited = new boolean[vertices];
            boolean[] recursionStack = new boolean[vertices];

            // Check for cycles starting from each vertex
            for (int i = 0; i < vertices; i++) {
                if (!visited[i]) {
                    if (dfs(i, visited, recursionStack)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of vertices and edges
        System.out.print("Enter the number of vertices in the graph: ");
        int vertices = scanner.nextInt();

        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges in the graph: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (u v) where u -> v:");

        // Input the edges
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }

        // Check if the graph has a cycle
        if (graph.hasCycle()) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }

        scanner.close();
    }
}

