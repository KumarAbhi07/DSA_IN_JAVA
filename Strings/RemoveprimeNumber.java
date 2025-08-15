package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveprimeNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <6; i++) {
            list.add(in.nextInt());
        }
        for (int i = list.size()-1;i>=0;i--) {
            int val=list.get(i);
            if(isprime(val)){
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }

    public static boolean isprime(int nums){
        if(nums==1){
            return false;
        }
        for (int i = 2; i*i<= nums ; i++) {
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }
}
