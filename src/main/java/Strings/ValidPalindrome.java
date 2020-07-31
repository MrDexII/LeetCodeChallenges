package Strings;

import java.util.stream.Collectors;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        String collect = s.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(value -> (char) value)
                .map(Object::toString)
                .collect(Collectors.joining());

        StringBuilder stringBuilder = new StringBuilder(collect);
        s = stringBuilder.toString();
        String anotherString = stringBuilder.reverse().toString();

        return s.equalsIgnoreCase(anotherString);
    }

    //two pointer
    public boolean isPalindrome2(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        //String s = "A man, a plan, a canal: Panama";
        String s = "race a car";

        System.out.println(validPalindrome.isPalindrome(s));
    }

}
