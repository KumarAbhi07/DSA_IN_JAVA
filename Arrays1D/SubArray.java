package Arrays1D;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size=input.nextInt();
        String [] arr =new String[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.next();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

        }
    }
}
