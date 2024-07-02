
import java.lang.classfile.components.ClassPrinter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Gatherer;

public class Mirror {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // public static Node createBST(int arr[], int st, int end) {

    // if (st > end) {
    // return null;
    // }

    // int mid = (st + end) / 2;
    // Node root = new Node(arr[mid]);
    // root.left = createBST(arr, st, mid - 1);
    // root.right = createBST(arr, mid + 1, end);
    // return root;

    // }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node balanceBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }


    


    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        // int arr[] = { 3, 6, 5, 8, 10, 11, 12 };
        // Node root = createBST(arr, 0, arr.length - 1);
        // // root = createMirror(root);
        preorder(root);

        root = balanceBST(root);
        preorder(root);
    }
}
