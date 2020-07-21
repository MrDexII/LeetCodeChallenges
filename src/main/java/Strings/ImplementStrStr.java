package Strings;

public class ImplementStrStr {

    public static int strStr1(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        int NeedlePointer = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(NeedlePointer)) {
                ++NeedlePointer;
                int HaystackPointer = i + 1;
                while (NeedlePointer < needle.length() && HaystackPointer < haystack.length()) {
                    if (haystack.charAt(HaystackPointer) != needle.charAt(NeedlePointer)) {
                        NeedlePointer = 0;
                        break;
                    }
                    NeedlePointer++;
                    HaystackPointer++;
                }
                if (NeedlePointer == needle.length())
                    return HaystackPointer - needle.length();
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0))
                if (haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issi";

        System.out.println(strStr2(haystack, needle));
    }

}
