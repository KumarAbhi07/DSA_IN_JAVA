package Arrays1D;

import java.util.Scanner;

public class AnybasetoAnybase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int b1=input.nextInt();
        int b2=input.nextInt();
        //System.out.println(anybasetodecimal(num, b1));
        System.out.println(decimaltoanybase(num,b2));

    }
    public static int anybasetoanybase(int num,int b1,int b2){
        int dec=anybasetodecimal(num,b1);
        int num1 =decimaltoanybase(dec,b2);
        return num1;
    }
    public static int anybasetodecimal(int n,int b){
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
    public static int decimaltoanybase(int num,int base){
        int p=1;
        int sum=0;
        while (num>0){
            int rem=num%base;
            num=num/10;
            sum+=rem*p;
            p*=base;
        }
        return sum;

    }
}
