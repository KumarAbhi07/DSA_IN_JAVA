package Recursion;

import java.util.Scanner;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        displayReverse(arr,0);

    }
    public static void displayReverse(int[] arr,int idx){
        if (idx == arr.length) {
            return;
        }
        displayReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
