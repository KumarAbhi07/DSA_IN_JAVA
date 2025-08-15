package Arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = input.nextInt();
//        }
        Scanner input=new Scanner(System.in);
        int[] arr={2,3,4,5,6,7};
        int d = input.nextInt();
        d=d%arr.length;
        if(d<0){
            d=d+arr.length;
        }
        /* Right rotate
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));*/

        //left rotate
        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
