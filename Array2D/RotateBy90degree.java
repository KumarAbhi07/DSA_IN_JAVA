package Array2D;

import java.util.Scanner;

public class RotateBy90degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        String[][] arr=new String[m][n];
        String[][] arr1=new String[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                  arr[i][j]=sc.next();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                arr1[i][j]=arr[arr[0].length-1-j][i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr1[0].length ; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

}
