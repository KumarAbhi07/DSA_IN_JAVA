package Strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(toggle(str));

    }
    public static String toggle(String str){
        StringBuilder sb=new StringBuilder(str);
        for (int i = 0; i <sb.length();i++){
            char ch=sb.charAt(i);
            if(ch>='a'&&ch<='z'){
                char uch=(char) ('A'-'a'+ch);
                sb.setCharAt(i,uch);
            }
            if(ch>='A'&&ch<='Z'){
                char lch=(char)('a'-'A'+ch);
                sb.setCharAt(i,lch);
            }

        }
        return sb.toString();
    }
}