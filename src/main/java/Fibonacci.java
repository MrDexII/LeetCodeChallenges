public class Fibonacci {

    public static void main(String[] args) {
        int number = 10;
        fibonacci(number);
    }

    public static void fibonacci(int i) {
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

    public static long fibonacciRecursion(int i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fibonacciRecursion(i - 1) + fibonacciRecursion(i - 2);

    }
}
//https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html