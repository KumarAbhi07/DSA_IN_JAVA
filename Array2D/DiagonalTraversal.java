package Array2D;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][] arr= new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0,j=g; j<arr.length ; j++,i++) {
                System.out.println(arr[i][j]);
            }

        }
    }
}
