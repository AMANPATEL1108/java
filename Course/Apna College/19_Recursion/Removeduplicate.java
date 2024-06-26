public class Removeduplicate {
    public static void main(String[] args) {
        String str = "appnnacollege";

        Remove(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void Remove(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr.toString());
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a']) {
            Remove(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            Remove(str, idx + 1, newStr.append(currChar), map);
        }
    }
}
