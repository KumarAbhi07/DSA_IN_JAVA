package Array2D;

import java.util.Scanner;

public class InputIn2DArrays{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int cols=input.nextInt();
        int[][] arr=new int[row][cols];
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=input.nextInt();
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
