package Revision;

import java.util.Scanner;
import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        char[] arr=str.toCharArray();
        int d = input.nextInt();
        String str1="";

        d=d%arr.length;
        if(d<0){
            d=d+arr.length;
        }

        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(char i:arr){
            str1+=i;

        }
        System.out.println(str1);
    }
    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(char[] arr,int index1,int index2){
        char temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
