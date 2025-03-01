public class Checkiftwostringsmatchwhereonestringcontainswildcardcharacters {
    public static boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] dp = new boolean[sLen + 1][pLen + 1];

        dp[0][0] = true;

        for (int j = 1; j <= pLen; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];

                } else if (p.charAt(j - 1) == '?' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }

            }
        }
        return dp[sLen][pLen];

    }

    public static void main(String[] args) {
        String str = "adceb";
        String pattern = "*a*b";

        if (isMatch(str, pattern)) {
            System.out.println("The String matches the pattern.");
        } else {
            System.out.println("The String deos not match the pattern.");
        }
    }
}
