package binary;

public class ReverseBits {

    public static void main(String[] args) {
        int binaryNumber = 0b00000010100101000001111010011100;
        int reversedBinaryNumber = reverse2(binaryNumber);
        System.out.print(binaryNumber + " ");
        System.out.println("00000010100101000001111010011100");
        System.out.print(reversedBinaryNumber + " ");
        System.out.println(Integer.toBinaryString(reversedBinaryNumber));

        System.out.println();

        int binaryNumber2 = 0b11111111111111111111111111111101;
        int reversedBinaryNumber2 = reverse2(binaryNumber2);
        System.out.print(binaryNumber + " ");
        System.out.println("00000010100101000001111010011100");
        System.out.print(reversedBinaryNumber2 + " ");
        System.out.println(Integer.toBinaryString(reversedBinaryNumber2));

    }
    // time complexity O(1)
    // space complexity O(1)
    private static int reverse(int n) {
        String binaryString = Integer.toBinaryString(n);
        int leadingZeros = 32 - binaryString.length();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < leadingZeros; i++) {
            builder.append('0');
        }

        for (int i = 0; i < binaryString.length(); i++) {
            builder.append(binaryString.charAt(i));
        }

        String reversed = builder.reverse().toString();

        return Integer.parseUnsignedInt(reversed, 2);
    }

    // time complexity O(1)
    // space complexity O(1)
    private static int reverse2(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            res = res | (bit << (31 - i));
        }
        return res;
    }
}
