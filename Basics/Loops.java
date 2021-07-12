import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops and Examples");

        // For Loop  --> for (initialization; condition; increment/decrement )
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a table you want to print : ");
        int table = scan.nextInt();
        System.out.println("Table of " + table + " ....\n");
        for(int i=1;i<=10;i++) {
            System.out.println(table+" * "+i+" = "+(table*i));
        }

        // Factorial
        System.out.println("\nEnter a number: ");
        int n = scan.nextInt();
        int factorial = 1;
        for (int i=1;i<=n;i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);

        // Fibonacci Sequence
        System.out.println("Enter the length of Fibonacci Series you want : ");
        int fib = scan.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0; i<fib-2; i++) {
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        // Prime Number [Yes/No]
        System.out.println("\nEnter a number: ");
        int prime = scan.nextInt();
        boolean isPrime = prime==1 ? false : true;
        for(int i=2; i*i<=prime; i++) {
            if (prime % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(prime + " is a Prime Number.");
        else
            System.out.println(prime + " is not a Prime Number.");

        // Serial Sum -> 1 + 1/2 + 1/3 + 1/4 + ..... + 1/n

        int n = 5;
        double sum = 0;
        for(double i=1;i<=n;i++) {
            sum += 1/i;
        }
        System.out.println(sum);

        // Serial Sum 2 -> 1 - 1/2 + 1/3 -1/4 + 1/5 - 1/6 + .... 1/n

        int n = 5;
        double sum = 0;
        for(double i=1;i<=n;i++) {
            if (i%2 == 0)
                sum -= 1/i;
            else
                sum += 1/i;
        }
        System.out.println(sum);

        // While Loop --> while (condition) { .... }

        // Sum of digits of a number

        int num = 256;
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("Sum of digits of "+num+" is "+sum);

        // No. of digits in number num is : log10(num)+1

        // Palindrome Number

        int number = 102201;
        int reverseNumber = 0;
        int duplicate = number;
        while (duplicate>0) {
            int rem = duplicate%10;
            duplicate /= 10;
            reverseNumber = reverseNumber*10 + (rem);
        }
        if (reverseNumber == number) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        // do - while Loop -->  do { ... } while(condition);

        int n = 5;
        do {
            System.out.println("n = "+n);
            n--;
        } while(n != 0);
        scan.close();
    }
}
