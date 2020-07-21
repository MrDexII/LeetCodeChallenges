public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        long p = (long) n;
        if ((p & -p) == p)
            return true;
        else
            return false;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n < 0) return false;
        String binaryString = Integer.toBinaryString(n);
        return binaryString.contains("1") && binaryString.lastIndexOf("1") == binaryString.indexOf('1');
    }

    public boolean isPowerOfTwo3(int n) {
        long i = 1;
        while (i < n)
            i *= 2;
        return i == n;
    }
    public boolean isPowerOfTwo4(int n) {
        return (n > 0) && (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo4(4));
    }
}
