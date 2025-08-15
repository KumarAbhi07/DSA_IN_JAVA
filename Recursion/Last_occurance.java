package Recursion;

import java.util.Scanner;

public class Last_occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastIndex(arr,0,x));
    }
    public static int lastIndex(int[] arr,int idx,int x){
        if(idx==arr.length){
            return -1;
        }
        int last=lastIndex(arr,idx+1,x);
        if(last==-1){
            if(arr[idx]==x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return last;
        }
    }
}
