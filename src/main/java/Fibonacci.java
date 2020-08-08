public class Fibonacci {
    public void fibonacci(int i) {
        long a = 0;
        long b = 1;
        long result = 0;

        if (i == 0)
            System.out.print(i);
        else
            System.out.print(0 + " " + 1 + " ");

        while (i > 1) {
            result = a + b;
            a = b;
            b = result;
            i--;
            System.out.print(result + " ");
        }
    }

    public long fibonacciRecursion(int i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fibonacciRecursion(i - 1) + fibonacciRecursion(i - 2);
    }

    public long fibonacciRecursionMemoization(int i, long[] memo) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else if (memo[i - 1] == 0)
            memo[i - 1] = (fibonacciRecursionMemoization(i - 1, memo) + fibonacciRecursionMemoization(i - 2, memo));
        return memo[i - 1];
    }

    public static void main(String[] args) {
        int number = 10;
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.fibonacciRecursionMemoization(number, new long[number]));
    }
}
