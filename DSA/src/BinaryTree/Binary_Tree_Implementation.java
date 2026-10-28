package BinaryTree;

public class Binary_Tree_Implementation {
    public static void main(String[] args) {
        BT tree = new BT();

        // Inserting values
        tree.insert(8);
        tree.insert(5);
        tree.insert(12);
        tree.insert(2);
        tree.insert(7);

        System.out.println("In-order Traversal (Sorted Output):");
        tree.inOrder();
    }
}

// Class representing an individual node in the tree
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BT {
    Node root;

    // Method to insert a new node into the BST
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, int data) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    // In-order Traversal: Left -> Root -> Right
    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderRecursive(root.right);
        }
    }
}
