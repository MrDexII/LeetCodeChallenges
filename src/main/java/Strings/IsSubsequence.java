package Strings;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;
        int pointerS = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pointerS) == t.charAt(i))
                pointerS++;
            if (pointerS == s.length())
                return true;
        }
        return false;
    }

    public boolean isSubsequence2(String s, String t) {
        if (s == null || s.isEmpty()) return true;
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
//        String s = "abc";
//        String t = "ahbgdc";
        String s = "axc";
        String t = "ahbgdc";
        boolean subsequence = isSubsequence.isSubsequence2(s, t);
        System.out.println(subsequence);
    }
}
