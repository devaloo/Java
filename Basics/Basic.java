import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello World !!");

        // Arithmetic Operators
        int a = 4;
        int b = 10;
        int c = (a*b); // 40
        double d = b/a; // 2
        int e = b++; // 10, b = 11
        int f = ++a + b++; // 16, a = 5, b = 12
        int h = a%b; // 5
        System.out.println(h);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);
        System.out.println((double)10/4); // 2.5 --> If any one operand is double, output is double. Here 10 is double.

        // Bitwise Operators
        int a = 10; //    1010
        int b = 6; //     0110
        int c = a & b; // 0010 --> 2
        System.out.println(c);
        int d = a|b; //   1110 --> 14
        System.out.println(d);
        int e = a^b; //   1100 --> 12
        System.out.println(e);
        int f = a>>2; //  1010 >> 2 --> 0010 --> 2  [a/2^2]
        System.out.println(f);
        int g = b<<3; //  0110 << 3 --> 110000 --> 48  [b*2^3]
        System.out.println(g);

        // Assignment Operators
        int a = 10;
        int b = 20;
        b = b+a;
        System.out.println(b);
        b += a;
        System.out.println(b);
        b /= 5;
        System.out.println(b);
        b >>= 2;
        System.out.println(b);
        b %= 25;
        System.out.println(b);

        // Comparision Operators
        int a = 10;
        int b = 20;
        System.out.println(a<b);
        System.out.println(a>=b);
        boolean isAHigher = a>b;
        System.out.println(isAHigher);

        // Logical Operators
        int a = 10;
        int b = 20;
        boolean x = (a==10) && (b!=20);
        boolean y = (a==10) || (b==0);
        boolean z = !(a!=10);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Conditional Statements

        int a = 20;
        int b = 100;
        if (a<b) {
            System.out.println("a < b");
        } else if (a>b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

        // Ternary Operator --> condition ? expressionTrue : expressionFalse;

        int a = 10;
        int b = a<=10 ? 20:10;
        boolean isAMoreThanB = a>b? true: false;
        System.out.println(b);
        System.out.println(isAMoreThanB);

        // User Input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int myAge = scan.nextInt();
        System.out.println("Enter GPA: ");
        double myGPA = scan.nextDouble();
        scan.nextLine(); // to escape Enter key as name string
        System.out.println("Enter Name: ");
        String myName = scan.nextLine();
        System.out.println("My name is " + myName + " and I'm " + myAge + " years old. My GPA is " + myGPA + "/10");

    }
}
