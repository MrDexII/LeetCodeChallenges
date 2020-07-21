package Strings;

import java.util.Arrays;

public class ReverseString {


    public char[] reverseString(char[] s) {
        int pointer1 = 0;
        int pointer2 = s.length - 1;
        while (pointer1 < pointer2) {
            char temp = s[pointer1];
            s[pointer1++] = s[pointer2];
            s[pointer2--] = temp;
        }
        return s;
    }

    private char[] reversArray;
    public void reverseStringReq(char[] s) {
        //     int pointer1 = 0;
        //     int pointer2 = s.length - 1;
        //     while (pointer1 < pointer2) {
        //         char temp = s[pointer1];
        //         s[pointer1] = s[pointer2];
        //         s[pointer2] = temp;
        //         pointer1++;
        //         pointer2--;
        //     }
        this.reversArray = new char[s.length];
        helper(0, s);
        s = this.reversArray;
        System.out.println(Arrays.toString(s));
    }
    private void helper(int index, char[] s) {
        if (s == null || index >= s.length) return;
        helper(index + 1, s);
        this.reversArray[s.length - index - 1] = (s[index]);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        char[] chars = {'h','e','l','l','o'};

        reverseString.reverseStringReq(chars);
    }
}
