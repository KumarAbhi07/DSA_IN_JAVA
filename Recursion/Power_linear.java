package Recursion;
import java.util.Scanner;
public class Power_linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(power(x,y));

    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xn=power(x,n-1);
        int p=x*xn;
        return p;
    }
}
