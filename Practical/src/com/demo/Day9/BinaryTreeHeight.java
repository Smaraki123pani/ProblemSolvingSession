package com.demo.Day9;

import java.util.Scanner;

public class BinaryTreeHeight {
    // Node class to represent each node in the tree
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root of the binary tree
    Node root;

    // Constructor to create an empty binary tree
    public BinaryTreeHeight() {
        root = null;
    }

    // Method to insert a node in the tree (for simplicity)
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Method to find the height of the binary tree
    public int height(Node root) {
        if (root == null) {
            return -1; // Base case: height of an empty tree is -1
        }
        // Recursively find the height of the left and right subtrees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // The height of the current tree is 1 + the maximum height of the left or right subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Enter the number of nodes in the binary tree:");
        int n = sc.nextInt();

        System.out.println("Enter the node values for the binary tree:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        // Find the height of the binary tree
        int height = tree.height(tree.root);
        System.out.println("The height of the binary tree is: " + height);

        sc.close();
    }
}
