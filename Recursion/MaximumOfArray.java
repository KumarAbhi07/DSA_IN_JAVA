package Recursion;

import java.util.Scanner;

public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum(arr,0));;
    }
    public static int maximum(int[] arr,int idx){
//        if(idx==arr.length){
//            return -1;
//        }
//        int max=maximum(arr,idx+1);
//        if(max<arr[idx]){
//            max=arr[idx];
//        }
//
//       return max;
        if(idx==arr.length-1){
             return arr[idx];
        }
        int max=maximum(arr,idx+1);
        if(max>arr[idx]){
            return max;
        }
        else{
            return arr[idx];
        }
    }

}
