package binary;

public class NumberOf1Bits {

    public static void main(String[] args) {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        int n1 = 0b00000000000000000000000000001011;
        int n2 = 0b00000000000000000000000010000000;
        int n3 = 0b11111111111111111111111111111101;

        System.out.println(numberOf1Bits.hammingWeight2(n1));
        System.out.println(numberOf1Bits.hammingWeight2(n2));
        System.out.println(numberOf1Bits.hammingWeight2(n3));
    }

    //time complexity O(1) or o(32)
    public int hammingWeight1(int n) {
        int count = 0;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    //with bit operating
    public int hammingWeight2(int n) {
        int count = 0;
        int a = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & a) != 0) count++;
            a <<= 1;
        }
        return count;
    }
}
