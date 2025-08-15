package Arrays1D;

import java.util.Scanner;

public class AnybasetoDecimal{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int base=sc.nextInt();
        System.out.println(decimal(num,base));
    }
    public static int decimal(int num,int base){
        int p=1;
        int sum=0;
        while (num>0){
            int rem=num%10;
            num=num/10;
            sum+=rem*p;
            p*=base;
        }
        return sum;

    }
}
