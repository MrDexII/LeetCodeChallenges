package binary;

public class SumOfTwoIntegers {
    //time complexity O(n)
    //space complexity O(1)
    public static int getSum(int a, int b) {
        int c;
        while (b != 0) {
            c = (a & b);
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(9, -3));
        System.out.println(getSum(3, 6));
    }
}
//https://leetcode.com/problems/sum-of-two-integers/discuss/132479/Simple-explanation-on-how-to-arrive-at-the-solution