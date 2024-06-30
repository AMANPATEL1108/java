
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Heightoftree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static int height(Node root) {
    // if (root == null) {
    // return 0;
    // }

    // int lh = height(root.left);
    // int rh = height(root.right);
    // return Math.max(lh, rh) + 1;
    // }

    // public static int count(Node root) {
    // if (root == null) {
    // return 0;
    // }

    // int leftCount = count(root.left);
    // int rightCount = count(root.right);
    // return leftCount + rightCount + 1;
    // }

    // public static int sum(Node root) {
    // if (root == null) {
    // return 0;
    // }

    // int leftSum = sum(root.left);
    // int rightSum = sum(root.right);
    // return leftSum + rightSum + root.data;
    // }

    // public static int diameter2(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int leftDiam = diameter2(root.left);
    // int leftHt = height(root.left);
    // int rightDiam = diameter2(root.right);
    // int rightHt = height(root.right);

    // int selfDiam = leftHt + rightHt + 1;

    // return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    // }

    // static class Info {
    // int diam;
    // int ht;

    // public Info(int diam, int ht) {
    // this.diam = diam;
    // this.ht = ht;
    // }
    // }

    // public static Info diameter(Node root) {
    // if (root == null) {
    // return new Info(0, 0);
    // }
    // Info leftInfo = diameter(root.left);
    // Info rightInfo = diameter(root.right);

    // int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht +
    // rightInfo.ht + 1);
    // int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

    // return new Info(diam, ht);
    // }

    // public static boolean isSubtree(Node root, Node subRoot) {
    // if (root == null) {
    // return false;
    // }

    // if (root.data == subRoot.data && isIdentical(root, subRoot)) {
    // return true;
    // }

    // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    // }

    // public static boolean isIdentical(Node node, Node subRoot) {
    // if (node == null && subRoot == null) {
    // return true;
    // }
    // if (node == null || subRoot == null || node.data != subRoot.data) {
    // return false;
    // }

    // return isIdentical(node.left, subRoot.left) && isIdentical(node.right,
    // subRoot.right);
    // }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(diameter(root).diam);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(isSubtree(root, subRoot)); // Should print true if subRoot
        // is a subtree of root

        topView(root);
    }
}
