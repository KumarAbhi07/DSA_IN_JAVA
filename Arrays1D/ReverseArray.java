package Arrays1D;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=input.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
