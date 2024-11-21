package com.demo.Day9;

import java.util.Scanner;

public class BinarySearchTree {
    // Node class to represent each node in the BST
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root of the binary search tree
    Node root;

    // Constructor to create an empty BST
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node in the BST
    public Node insert(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to search for a node in the BST
    public boolean search(Node root, int key) {
        // Base case: root is null or key is present at the root
        if (root == null) {
            return false; // Element not found
        }
        if (root.data == key) {
            return true; // Element found
        }

        // If the key is smaller than the root's data, search the left subtree
        if (key < root.data) {
            return search(root.left, key);
        }

        // If the key is larger than the root's data, search the right subtree
        return search(root.right, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter the number of nodes in the binary search tree:");
        int n = sc.nextInt();

        System.out.println("Enter the node values for the binary search tree:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.root = bst.insert(bst.root, value);
        }

        System.out.println("Enter the element to search in the BST:");
        int element = sc.nextInt();

        // Search for the element in the BST
        if (bst.search(bst.root, element)) {
            System.out.println("Element " + element + " is present in the BST.");
        } else {
            System.out.println("Element " + element + " is not present in the BST.");
        }

        sc.close();
    }
}
