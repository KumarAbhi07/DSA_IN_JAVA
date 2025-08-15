package Arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class InverseofArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr= new int[size];
        int[] nums=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<size;i++){
          nums[arr[i]]=i;

        }
        System.out.println(Arrays.toString(nums));
    }
}
