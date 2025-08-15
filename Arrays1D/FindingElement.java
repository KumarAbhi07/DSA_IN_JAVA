package Arrays1D;

import java.util.Scanner;

public class FindingElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size=input.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();

        }
        int target=input.nextInt();
        System.out.println(finding(arr,target));

    }
    public static int finding(int[] arr,int tar){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==tar){
                return i;
            }

        }
        return -1;
    }
}
