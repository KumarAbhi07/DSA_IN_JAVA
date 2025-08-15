package Array2D;

import java.util.Scanner;

public class SearchInSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] arr=new int[m][n];
        for (int  i = 0;  i < arr.length ;  i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();

            }
        }
        int target=sc.nextInt();

        int i=0;
        int j= arr.length-1;
        while(i<arr.length&&j>=0){
            if(target==arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(target<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(-1);
    }
}
