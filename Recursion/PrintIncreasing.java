package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        printIncreasing(input);
    }
    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
