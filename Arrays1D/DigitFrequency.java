package Arrays1D;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int target=sc.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            if(rem==target){
                count++;
            }

        }
        System.out.println(count);
    }
}
