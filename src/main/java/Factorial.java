import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(factorial(number));
        System.out.println(factorialRecursive(number));
        System.out.println(factorialDeclarative(number));
        //System.out.println(Long.MAX_VALUE);
    }

    private static long factorial(int i) {
        long result = 1;
        if (i == 0 || i == 1)
            return 1;
        for (int j = 1; j <= i; ++j)
            result *= j;
        return result;
    }

    private static long factorialRecursive(int i) {
        if (i == 0 || i == 1) return 1;
        return i * factorialRecursive(i - 1);
    }

    private static long factorialDeclarative(int number) {
        return LongStream
                .range(1, number + 1)
                .reduce(1, (base, multi) -> base * multi);
    }
}