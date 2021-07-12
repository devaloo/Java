public class CodeConversions {
    public static void main(String[] args) {
        System.out.println("Numerical Conversions ");

        System.out.println("\nBinary <--> Decimal \n");
        // Decimal to Binary
        int a = 10;
        String binaryString = Integer.toBinaryString(a);
        System.out.println(binaryString); // 1010

        // Binary to Decimal
        int decimalNum = Integer.parseInt(binaryString,2);
        System.out.println(decimalNum); // 10

        System.out.println("\nHexa-decimal <--> Decimal \n");
        // Decimal to Hexa-decimal
        int b = 59;
        String hexString = Integer.toHexString(b);
        System.out.println(hexString); // 3b

        // Hexa-decimal to Decimal
        int decimal = Integer.parseInt(hexString,16);
        System.out.println(decimal); // 59

        System.out.println("\nOctal <--> Decimal \n");
        // Decimal to Octal
        int c = 25;
        String octalString = Integer.toOctalString(c);
        System.out.println(octalString); // 31

        // Octal to Decimal
        int decimalNumber = Integer.parseInt(octalString,8);
        System.out.println(decimalNumber); // 25

    }
}

