public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern Printing");

        // Multiplication Tables - 1 to 20

        for(int i=1;i<=20;i++) {
            System.out.println("Table - "+i);
            System.out.println("----------");
            for(int j=1;j<=10;j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("\n\n");
        }

        int n = 5;

//            Pattern 1
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//            Pattern 2
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//            Pattern 3
//            * * * * *
//              * * * *
//                * * *
//                  * *
//                    *

        for(int i=0;i<n;i++) {
            for(int j=0;j<2*i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//            Pattern 4
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *

        for(int i=n;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//            Pattern 5
//                    *
//                  * *
//                * * *
//              * * * *
//            * * * * *

        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print("  ");
            }
            for(int j=0;j<i;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n\n");

//             Pattern 6
//                  *
//                *  *
//              *  *  *
//            *  *  *  *

        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++)
                System.out.print("  ");
            for(int j=0;j<i;j++)
                System.out.print("*  ");
            System.out.println();
        }
        System.out.println("\n\n");

//        Pattern 7
//              1
//            2  3
//          4  5  6
//        7  8  9  10

        int counter = 1;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++)
                System.out.print("  ");
            for(int j=0;j<i;j++) {
                System.out.print(counter + "  ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("\n\n");

//         Pattern 8
//            *
//            * *
//            * * *
//            * * * *
//            * * *
//            * *
//            *

        for(int i=1;i<=2*n-1;i++) {
            if (i<=n) {
                for(int j=1;j<=i;j++) {
                    System.out.print("* ");
                }
            } else {
                for(int j=1;j<=2*n-i;j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");

//         Pattern 9
//            *
//            * *
//            *   *
//            *     *
//            * * * * *

        for(int i=1;i<=n;i++) {
            if (i==1) {
                System.out.print("* ");
            } else if (i==n) {
                for(int j=1;j<=n;j++)
                    System.out.print("* ");
            } else {
                System.out.print("* ");
                for(int j=1;j<=i-2;j++)
                    System.out.print("  ");
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
