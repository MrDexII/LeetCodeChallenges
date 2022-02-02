public class Palindrome {
    public static void main(String[] args) {
        int a = 12133121;
        String string = "abcscba";
        System.out.println(palindromeNoSB2(string));
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

    private static boolean palindromeNoSB2(String value) {
        char[] reversString = new char[value.length()];

        int start = 0;
        int end = value.length() - 1;

        while (start <= end) {
            reversString[end] = value.charAt(start);
            reversString[start] = value.charAt(end);
            start++;
            end--;
        }
        return value.equals(new String(reversString));
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
