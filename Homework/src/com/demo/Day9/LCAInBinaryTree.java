// 1. Create a program to find the lowest common ancestor (LCA) of two nodes in a binary tree.

package com.demo.Day9;

import java.util.Scanner;

class BinaryTree {
    Node root;

    // Node class representing each node in the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to find the LCA of two nodes in the binary tree
    public Node findLCA(Node root, int n1, int n2) {
        // Base case: if the root is null, return null
        if (root == null) {
            return null;
        }

        // If the root matches either n1 or n2, return the root
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Recursively find LCA in the left and right subtrees
        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        // If LCA is found in both left and right subtrees, return root
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return the non-null child
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Method to insert nodes in the binary tree (for simplicity)
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Method to perform inorder traversal of the binary tree (optional)
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}

public class LCAInBinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 22);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 14);

        // Perform inorder traversal (optional)
        System.out.println("Inorder Traversal of the Tree:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        // Input the two nodes to find LCA
        System.out.print("Enter the first node: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second node: ");
        int n2 = scanner.nextInt();

        // Find the LCA of the two nodes
        BinaryTree.Node lca = tree.findLCA(tree.root, n1, n2);

        if (lca != null) {
            System.out.println("The Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("LCA not found.");
        }

        scanner.close();
    }
}

