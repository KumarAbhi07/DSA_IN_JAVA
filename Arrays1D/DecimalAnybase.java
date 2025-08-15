package Arrays1D;

import java.util.Scanner;

public class DecimalAnybase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(anybase(n,b));
    }
    public static int anybase(int n,int b){
        int num=0;
        int p=1;
        while(n>0){
            int dig=n%b;
            n=n/b;
            num+=dig*p;
            p*=10;

        }
        return num;

    }
}
