package Strings;

import java.io.InputStream;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int n=str.length();
        int f=fact(n);
        for (int i =0; i < f; i++) {
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for (int div =n; div>=1 ; div--) {
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp=q;
            }
            System.out.println();
        }
    }
    public static int fact(int num){
        int f=1;
        for(int i=2;i<=num;i++){
            f=f*i;
        }
        return f;
    }
}
