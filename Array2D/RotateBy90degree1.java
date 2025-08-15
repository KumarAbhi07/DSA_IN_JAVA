package Array2D;

import java.util.Scanner;

public class RotateBy90degree1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        String[][] arr=new String[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.next();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                String temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            
        }

        for (int i = 0; i < arr.length; i++) {
            int start=0;
            int end = arr[i].length-1;
            while (start<end){
                String temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
}
}
