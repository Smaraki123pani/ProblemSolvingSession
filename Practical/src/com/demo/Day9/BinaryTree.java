package com.demo.Day9;

import java.util.Scanner;

public class BinaryTree {
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
    public BinaryTree() {
        root = null;
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Inorder Traversal (Left, Root, Right)
    public void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    // Method to insert a node in the tree (for simplicity)
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

    // Method to perform tree traversals using Scanner input
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

        System.out.println("Preorder traversal of the binary tree:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Postorder traversal of the binary tree:");
        tree.postorderTraversal(tree.root);
        System.out.println();

        sc.close();
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

}

