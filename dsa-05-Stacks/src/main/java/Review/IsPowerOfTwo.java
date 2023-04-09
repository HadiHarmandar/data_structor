package Review;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }

    public static boolean isPowerOfTwo(int n) {
        // base condition
        if (n == 1)
            return true;
        if (n % 2 != 0 || n <= 0)
            return false;
        return isPowerOfTwo(n / 2);
    }
}
