package Array2D;

import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int[][]arr1=new int[r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j]=sc.nextInt();
            }

        }
        if(c1!=r2){
            System.out.println("Invalid input");
        }
        int[][] arr=new int[r1][c2];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                for (int k = 0; k < c1; k++) {
                    arr[i][j]+=arr1[i][k]*arr2[k][i];
                }
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}