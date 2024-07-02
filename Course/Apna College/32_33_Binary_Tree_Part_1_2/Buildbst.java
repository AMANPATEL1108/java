import java.util.ArrayList;

public class Buildbst {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }

        return root;

    }

    public static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);

    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        }

        else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        // Traverse the tree to find the node to delete
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // Node to be deleted is found

            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            // Get the inorder successor (smallest in the right subtree)
            Node successor = findInorderSuccessor(root.right);

            // Copy the inorder successor's content to this node
            root.data = successor.data;

            // Delete the inorder successor
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree if the current node is greater than k1
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }

        // Print the current node if it is within the range [k1, k2]
        if (root.data >= k1 && root.data <= k2) {
            System.out.println(root.data + " ");
        }

        // Traverse the right subtree if the current node is less than k2
        if (root.data < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            if (i == path.size() - 1) {
                System.out.print(path.get(i));
            } else {
                System.out.print(path.get(i) + "->");
            }
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add the current node to the path
        path.add(root.data);

        // If it's a leaf node, print the path
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Otherwise, continue to explore the left and right subtrees
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        // Remove the current node from the path when backtracking
        path.remove(path.size() - 1);
    }

    public static boolean isvalidsBst(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data >= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }

        return isvalidsBst(root.left, max, root)

                && isvalidsBst(root.right, max, root);
    }


    public static void Mirrorbst() {
        
    }
    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 6, 10, 11, 14 };
        // int value[] = { 1, 1, 1 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        // inorder(root);
        // System.out.println();
        // if (search(root, 1)) {
        // System.out.println("Found");
        // } else {
        // System.out.println("Not Found");
        // }
        // }
        // root = delete(root, 1);
        // System.out.println();
        // // inorder(root);
        // printInRange(root, 5, 12);
        printRoot2Leaf(root, new ArrayList<>());

        if (isvalidsBst(root, null, null)) {
            System.out.println("valis");
        } else {
            System.out.println("Not valid");
        }
    }
}