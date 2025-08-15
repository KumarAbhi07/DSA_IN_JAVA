package Strings;

import java.util.Scanner;

public class PrintAllPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();

        for (int i = 0; i <str.length() ; i++) {
            for(int j=i+1;j<=str.length();j++){

                if(isPalindrome(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                }
            }

        }

    }
    public static boolean isPalindrome(String str){
        boolean bool=true;
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if(str.charAt(start)==str.charAt(end)){
                bool=true;
                start++;
                end--;
            }
            else{
                bool=false;
                break;
            }
        }

    return bool;
    }
}
