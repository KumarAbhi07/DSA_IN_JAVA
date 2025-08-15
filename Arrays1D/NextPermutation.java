package Arrays1D;


import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={2,4,1,7,5,0};
        nextper(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextper(int[] arr){
        int pivot=-1;
        for(int i=arr.length-2; i>=0;i--){
            if (arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if (pivot==-1){
            reverse(arr,0,arr.length-1);
            return;
        }
        for(int i= arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr, i,pivot);
                break;
            }
        }
        reverse(arr,pivot+1,arr.length-1);

    }
    public static void reverse(int[] arr, int start, int end){

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
