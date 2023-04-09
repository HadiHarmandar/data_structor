public class RecursiveFibonacci {
    public static void main(String[] args) {

        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(7));

        System.out.println(fact(5));

    }

    public static int fib(int n) {
        if (n == 0) return 0; // termination
        if (n == 1) return 1; // termination
        return fib(n - 1) + fib(n -2);
    }

    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
