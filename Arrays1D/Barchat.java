package Arrays1D;

import java.util.Scanner;

public class Barchat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        for (int floor = max; floor >=1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>=floor){
                    System.out.print("#\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
