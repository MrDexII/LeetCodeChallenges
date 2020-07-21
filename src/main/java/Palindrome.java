public class Palindrome {
    public static void main(String[] args) {
        int a = 1233121;
        System.out.println(numberPalindrome(a));
    }

    private static boolean palindrome(String value) {
        StringBuilder temp = new StringBuilder(value);
        if (temp.reverse().toString().equals(value))
            return true;
        else
            return false;
    }

    private static boolean palindromeNoSB(String value) {
        char[] reversedTab = new char[value.length()];
        int iterator = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            reversedTab[iterator] = value.charAt(i);
            iterator++;
        }
        if (value.equals(new String(reversedTab)))
            return true;
        else
            return false;
    }

    private static boolean numberPalindrome(int value) {
        String reversedValue = "";
        int memorisedValue = value;
        while (true) {
            int i = memorisedValue % 10;
            memorisedValue /= 10;
            reversedValue += String.valueOf(i);
            if (memorisedValue == 0)
                break;
        }
        if (value == Integer.valueOf(reversedValue))
            return true;
        else
            return false;
    }
}
