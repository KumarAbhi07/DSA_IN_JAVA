package Recursion;

import java.util.Scanner;

public class FirstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d=sc.nextInt();
        int first=firstIndex(arr,0,d);
        System.out.println(first);
    }
    public static int firstIndex(int[] arr,int idx,int d){
        if(idx==arr.length){
            return -1;
        }
//        int first=firstIndex(arr,idx+1,d);
//        if(arr[idx]==d){
//            return idx;
//        }
//        else{
//            return first;
//        }
        if(arr[idx]==d){
            return idx;
        }
        else{
            int first=firstIndex(arr,idx+1,d);
            return first;
        }
    }
}
