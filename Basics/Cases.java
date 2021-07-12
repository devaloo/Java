import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
        System.out.println("Switch Cases and Examples");

        // Switch statements
        int dayOfWeek = 3;
        switch(dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter correct dayOfWeek");
        }

        // Calculator - Basic
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        double a = scan.nextDouble();
        System.out.println("Enter second integer : ");
        double b = scan.nextDouble();
        System.out.println("Enter operation (+, -, *, /, %)");
        scan.nextLine();

        char operation = scan.nextLine().charAt(0);
        double result;
        switch(operation) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            case '%':
                result = a%b;
                break;
            default:
                result = 0;
                System.out.println("Invalid Operation");
        }
        System.out.println("Result is : " + String.format("%.2f",result)); // to format double to 2 decimal places
        scan.close();
    }
}
