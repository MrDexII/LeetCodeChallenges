package Arrays;

public class ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = false;
        String xString = Integer.toString(x);

        if (xString.charAt(0) == '-') {
            isNegative = true;
        }

        StringBuilder stringBuilder = new StringBuilder(xString);
        StringBuilder reverse = stringBuilder.reverse();

        if (isNegative) {
            reverse.deleteCharAt(reverse.length() - 1);
            reverse.insert(0, '-');
        }
        String reverseString = reverse.toString();

        long l = Long.parseLong(reverseString);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) l;
    }

    public int reverse2(int x) {
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && digit > 7) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && digit < -8) return 0;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse;

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        int result = reverseInteger.reverse2(-123);
        System.out.println(result);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
