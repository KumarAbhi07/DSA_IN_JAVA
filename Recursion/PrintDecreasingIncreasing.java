package Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        printdecreasingIncreasing(input);
    }
    public static void printdecreasingIncreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        printdecreasingIncreasing((n-1));

        System.out.println(n);
    }
}
