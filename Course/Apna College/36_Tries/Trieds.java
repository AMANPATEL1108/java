public class Trieds {

    static class Node {
        Node[] Children = new Node[26];
        boolean eow = false;
        int fre;

        public Node() {
            for (int i = 0; i < Children.length; i++) {
                Children[i] = null;
            }
            fre = 0;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.Children[idx] == null) {
                curr.Children[idx] = new Node();
            }
            curr = curr.Children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.Children[idx] == null) {
                return false;
            }
            curr = curr.Children[idx];
        }
        return curr.eow;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean insert2(String[] words) {
        boolean allInserted = true;
        for (String word : words) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int idx = Character.toLowerCase(word.charAt(i)) - 'a'; 
                if (curr.Children[idx] == null) {
                    curr.Children[idx] = new Node();
                }
                curr = curr.Children[idx];
                curr.fre++; 
            }
            curr.eow = true;
        }
        return allInserted;
    }

    public static void main(String[] args) {
        // String[] arr = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String arr[] = { "Zebra", "dog", "duck", "dove" };
        // for(int i = 0; i < arr.length; i++) {
        // insert(arr[i]);
        // }

        // String key = "ilikesamsung";
        // System.out.println(wordBreak(key));

        // System.out.println(search("ice")); // Output should be true
        // System.out.println(search("three")); // Output should be false

        insert2(arr); 
        // Test cases
        System.out.println(search("dog")); 
        System.out.println(search("cat")); 

        String key = "dogduck";
        System.out.println(wordBreak(key)); 
        
        Node curr = root;
        for (char c : "dog".toCharArray()) {
            int idx = Character.toLowerCase(c) - 'a';
            curr = curr.Children[idx];
        }
        System.out.println("Frequency of 'dog': " + curr.fre); 
    }
}
