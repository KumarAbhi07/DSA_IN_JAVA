package Arrays1D;

import java.util.ArrayList;

public class CounttheNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,5,5};


        boolean [] visited=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
//            if(count==2){
//               System.out.println(arr[i]);
////            }
            System.out.println(arr[i]+" "+count);
            }
        }
        }


