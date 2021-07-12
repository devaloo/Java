import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Arrays");

        // Declaration --> datatype[] varName = new datatype[n];
        double[] arr1 = new double[5];
        int arr2[] = {1,2,3,4,5,6};
        String arr3[];
        arr3 = new String[3];
        arr3[1] = "Deva";
        arr2[2] = 1999;

    /*      Default Values for arrays:
                numerical --> 0
                boolean   --> false
                String    --> null          */

        for (int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+" ");
        System.out.println();

        for (int i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");
        System.out.println();

        for (int i=0;i<arr3.length;i++)
            System.out.print(arr3[i]+" ");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int numberOfSubjects = scan.nextInt();
        int[] marks = new int[numberOfSubjects];
        System.out.println("Enter marks : ");

        for(int i=0;i<numberOfSubjects;i++) {
            marks[i] = scan.nextInt();
        }

        System.out.println("Marks are : ");
        // for-each loop -->  for(datatype var: arr[]) { ... }
        for(int mark: marks)
            System.out.print(mark+" ");
        System.out.println();

        // Multi-dimensional Arrays

        int[][] a = new int[3][3];
        System.out.println(a[0][2]);

        int b[][] = {{1,2,3,4},{5,8,6},{2,6,4,8,9,64,36}};
        System.out.println(b[1][2]);

        // Matrix Addition - user input

        System.out.println("Matrix Addition");
        System.out.println("Enter dimension of matrix: (m  n)");
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] outputMatrix = new int[rows][cols];

        System.out.println("Enter matrix A");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
                matrixA[i][j] = scan.nextInt();
        }

        System.out.println("Enter matrix B");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
                matrixB[i][j] = scan.nextInt();
        }

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                outputMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Resultant Matrix is : ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
                System.out.print(outputMatrix[i][j]+" ");
            System.out.println();
        }

        // Matrix Multiplication

        System.out.println("Matrix Multiplication");
        System.out.println("Enter dimensions of Matrix A");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        System.out.println("Enter dimensions of Matrix B");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        if (c1 != r2)
            System.out.println("Incompatible order of matrices..!!");
        else {
            int[][] matA = new int[r1][c1];
            int[][] matB = new int[r2][c2];
            int[][] matAB = new int[r1][c2];
            System.out.println("Enter Matrix A");
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    int num = scan.nextInt();
                    matA[i][j] = num;
                }
            }
            System.out.println("Enter Matrix B");
            for(int i=0;i<r2;i++) {
                for(int j=0;j<c2;j++) {
                    int num = scan.nextInt();
                    matB[i][j] = num;
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    matAB[i][j]=0;
                    for(int k=0;k<c1;k++)
                    {
                        matAB[i][j]+=matA[i][k]*matB[k][j];
                    }
                    System.out.print(matAB[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
