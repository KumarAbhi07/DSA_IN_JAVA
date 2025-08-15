package Array2D;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;

        int c=0;
        int t=m*n;
        while(c<t){
            //left wall
            for (int i =minr,j=minc; i <= maxr && c<t ; i++) {
                System.out.println(arr[i][j]);
                c++;
            }
            minc++;

            //bottom wall
            for (int i = maxr,j=minc; j <= maxc && c<t; j++) {
                System.out.println(arr[i][j]);
                c++;
            }
            maxr--;

            //right wall
            for (int i = maxr,j=maxc; i >=minr && c<t ; i--) {
                System.out.println(arr[i][j]);
                c++;
            }
            maxc--;

            //top wall
            for (int i = minr,j=maxc; j>=minc && c<t ; j--) {
                System.out.println(arr[i][j]);
                c++;
            }
            minr++;

        }

    }
}
