public class RecursionProblems {
    public static void main(String[] args) {
        
        System.out.println("Sum of Digits in 254: " + sumOfDigits(254));   // Sum of Digits in 254: 11
        System.out.println("3 power of 4 :" + power(3,4));        // 3 power of 4 :81
        System.out.println("GCD of 12,8 : " + GCD(8,12));                // GCD of 12,8 : 4
        System.out.println("13 in binary is : " + decimalToBinary(13));   // 13 in binary is : 1101
        
    }

    public static int sumOfDigits(int num) {
        if (num <= 0)
            return 0;
        return (num%10) + sumOfDigits(num/10);
    }

    public static int power(int base, int exponent) {
        if (exponent < 0)
            return -1;
        if (exponent == 0)
            return 1;
        return base * power(base,exponent-1);
    }

    public static int GCD(int a, int b) {
        if (a<0 || b<0)
            return -1;
        if (b==0)
            return a;
        return GCD(b, a%b);
    }

    public static int decimalToBinary(int num) {
        if (num < 0)
            return -1;
        if (num == 0)
            return 0;
        return (num%2) + 10*decimalToBinary(num/2);
    }
}
