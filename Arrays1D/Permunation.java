package Arrays1D;

import java.util.Scanner;

public class Permunation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int nfactr=fact(n-r);
        int per=nfact/nfactr;
        System.out.println("npr="+per);
    }
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f*=i;
        }
        return f;
    }
}
