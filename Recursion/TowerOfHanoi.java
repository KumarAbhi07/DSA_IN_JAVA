package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String t1=input.next();
        String t2=input.next();
        String t3=input.next();
        toh(n,t1,t2,t3);
    }
    public static void toh(int n,String t1,String t2,String t3){
        if(n==0){
            return;
        }
        toh(n-1,t1,t3,t2);
        System.out.println(n+"["+t1+"->"+t2+"]");
        toh(n-1,t3,t2,t1);
    }
}
