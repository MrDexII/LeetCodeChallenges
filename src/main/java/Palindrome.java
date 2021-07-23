public class Palindrome {
    public static void main(String[] args) {
        int a = 12133121;
        String string = "abcscba";
        System.out.println(palindrome(string));
    }

    private static boolean palindrome(String value) {
        StringBuilder temp = new StringBuilder(value);
        return temp.reverse().toString().equals(value);
    }

    private static boolean palindromeNoSB(String value) {
        char[] reversedTab = new char[value.length()];
        int iterator = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            reversedTab[iterator++] = value.charAt(i);
        }
        return value.equals(new String(reversedTab));
    }

    private static boolean palindrome(int value) {
        StringBuilder reversedValue = new StringBuilder();
        int memorisedValue = value;
        while (memorisedValue != 0) {
            int i = memorisedValue % 10;
            memorisedValue /= 10;
            reversedValue.append(i);
        }
        return value == Integer.parseInt(reversedValue.toString());
    }
}
