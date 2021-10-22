public class Recursion {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);

        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));

    }

    public static int factorial(int n) {
        if (n<0)
            return -1;
        if (n==1 || n==0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static int fibonacci(int n) {
        if (n<0)
            return -1;
        if (n==0 || n==1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
