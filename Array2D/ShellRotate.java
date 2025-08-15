package Array2D;

import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int m= input.nextInt();
        int n=input.nextInt();
        int[][] arr= new int[m][n];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        int s=input.nextInt();
        int r=input.nextInt();
        RotateShell(arr,s,r);
        print2DArray(arr);


    }
    public static void RotateShell(int[][] arr,int s, int r){
        int[] oned=fillonefromshell(arr,s);
        rotate(oned,r);
        fillShellfromOned(arr,s,oned);

    }
    public static int[] fillonefromshell(int[][] arr, int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int size=2*(maxr-minr+maxc-minc) ;// size= 2*(maxr-minr+1)+2*(maxc-minc+1)-4
        int[] oned=new int[size];

        //lw
        int idx=0;
        for (int i = minr,j=minc; i <=maxr ; i++) {
            oned[idx]=arr[i][j];
            idx++;
        }
        //bw
        for (int i = maxr,j=minc+1; j<=maxc ; j++) {
            oned[idx]=arr[i][j];
            idx++;
        }
        //rw
        for (int i = maxr-1,j=maxc; i >=minr ; i--) {
            oned[idx]=arr[i][j];
            idx++;
        }
        //tw
        for (int i = minr,j=maxc-1; j >=minc+1; j--) {
            oned[idx]=arr[i][j];
            idx++;
        }
        return oned;
    }
    public static void fillShellfromOned(int[][] arr,int s,int[] oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;


        //lw
        int idx=0;
        for (int i = minr,j=minc; i <=maxr ; i++) {
            arr[i][j]=oned[idx];
            idx++;
        }
        //bw
        for (int i = maxr,j=minc+1; j<=maxc ; j++) {
            arr[i][j]=oned[idx];
            idx++;
        }
        //rw
        for (int i = maxr-1,j=maxc; i >=minr ; i--) {
            arr[i][j]=oned[idx];
            idx++;
        }
        //tw
        for (int i = minr,j=maxc-1; j >=minc+1; j--) {
            arr[i][j]=oned[idx];
            idx++;
        }

    }

    public static void rotate(int[] arr, int k){
        k=k% arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}