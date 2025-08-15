package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        StringCompression1(s);
        StringCompression2(s);

    }
    public static void StringCompression1(String s){
        String str=""+s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char prev=s.charAt(i-1);
            char curr=s.charAt(i);
            if(curr!=prev){
                str+=curr;
            }

        }
        System.out.println(str);
    }
    public static void StringCompression2(String s){
        String str=""+s.charAt(0);
        int count=1;
        for (int i =1; i < s.length(); i++) {

            char curr = s.charAt(i);
            char pre = s.charAt(i-1);
            if(curr!=pre){
                if(count>1) {
                    str+= count;
                    count=1;
                }
                str+=curr;
            }
            else{
                count++;
            }

        }
        if(count>1) {
            str+= count;
            count=1;
        }
        System.out.println(str);
    }
}
