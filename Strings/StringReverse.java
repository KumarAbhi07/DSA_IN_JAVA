package Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String  s=input.nextLine();
        System.out.println(reverse1(s));


    }
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();


//        int start=0;
//        int end=s.length()-1;
//        while(start<=end){
//            String
//                    }

    }
    public static String reverse1(String s){
        int start=s.length()-1;
        String r="";
        while (start>=0){
            char ch=s.charAt(start);
            r+=ch;
            start--;

        }
        return r;
        
    }

}
