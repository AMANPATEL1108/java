
import java.util.ArrayList;
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

    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;

        }

        if (level == k) {
            System.out.println(root.data);
            return;
        }

        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        // Add the current node to the path
        path.add(root);

        // Check if the current node is the target node
        if (root.data == n) {
            return true;
        }

        // Check the left subtree
        if (root.left != null && getPath(root.left, n, path)) {
            return true;
        }

        // Check the right subtree
        if (root.right != null && getPath(root.right, n, path)) {
            return true;
        }

        // If the target node is not found, remove the current node from the path
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Get the path from root to n1 and root to n2
        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null;
        }

        // Compare the paths to get the first different value
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }

        // The previous node where paths diverged is the LCA
        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }

        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);

        if (leftDist == -1 && rightdist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightdist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(root, n1);
        int dist2 = lcaDist(root, n2);

        return dist1 + dist2;
    }

    public static int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);

        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
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
        // topView(root);
        // int k = 2;
        // KLevel(root, 1, k);
        // System.out.println(lca(root, n1, n2).data);
        // System.out.println(minDist(root, n1, n2));

        int n1 = 5, n2 = 1;
        // System.out.println(KAncestor(root, n2, n2));
        transform(root);
        preorder(root);
    }
}
