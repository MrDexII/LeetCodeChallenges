package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < s.length(); i++)
            if (map.get(s.charAt(i)) == 1)
                return i;
        return -1;
    }

    public static int firstUniqChar2(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static int firstUniqChar3(String s) {
        int a = -1;
        for(int i = 'a'; i <= 'z'; i++){
            int b = s.indexOf(i);
            if (b >= 0){
                if(b == s.lastIndexOf(i) && (b < a || a == -1))
                    a = b;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar2(s));
    }
}
