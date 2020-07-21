package Strings;

public class StringToInteger {
    public static int myAtoi1(String str) {
        if (str == null || str.length() == 0)
            return 0;
        str = str.trim();
        if (str.length() == 0)
            return 0;
        int indexOfFirstSpace = str.indexOf(" ");
        if (indexOfFirstSpace != -1)
            str = str.substring(0, str.indexOf(" "));
        StringBuilder stringBuilder = new StringBuilder();
        int startingIndex = 0;
        if (str.charAt(startingIndex) == '-') {
            stringBuilder.append(str.charAt(startingIndex));
            startingIndex++;
        } else if (str.charAt(startingIndex) == '+')
            startingIndex++;
        if (str.length() == 1 && !Character.isDigit(str.charAt(0)))
            return 0;
        for (int i = startingIndex; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                stringBuilder.append(str.charAt(i));
            else
                break;
        }
        if (stringBuilder.length() == 0 || stringBuilder.toString().equals("-"))
            return 0;
        if (Double.parseDouble(stringBuilder.toString()) > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (Double.parseDouble(stringBuilder.toString()) < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return Integer.parseInt(stringBuilder.toString());
    }

    public static int myAtoi2(String str) {
        if ( str == null ||str.length() == 0) return 0;
        str = str.trim();

        long num = 0;
        boolean isNegative = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (num > Integer.MAX_VALUE) {
                if (isNegative) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }

            if (c == '-') {
                if (i != 0) break;
                isNegative = true;
                continue;
            }

            if (c == '+') {
                if (i != 0) break;
                continue;
            }

            if (!Character.isDigit(c)) {
                break;
            }

            if (Character.isDigit(c)) {
                num = num * 10 + Character.getNumericValue(c);
            }
        }

        if (num > Integer.MAX_VALUE) {
            if (isNegative) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        } else {
            if (isNegative) {
                return (int) num * -1;
            } else {
                return (int) num;
            }
        }
    }
    public static void main(String[] args) {
        String str = "-";
        System.out.println(myAtoi2(str));
    }
}
