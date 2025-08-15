package StackAndQueue;

import java.util.*;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr={2,5,9,3,1,12,6,8,7};
        System.out.println(Arrays.toString(nextgreatestelemement(arr)));


    }
    public static int[] nextgreatestelemement(int[] arr){
        int[] nge =new int[arr.length];
        Stack<Integer> st=new Stack<>();

        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for (int i = arr.length-2; i >=0 ; i--) {
            while(st.size()>0 && arr[i]>=st.peek()){
                  st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
