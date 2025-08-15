package Arrays1D;

public class ArrayMultiplyWithIndex {
    public static void main(String[] args) {
        int[] arr={4,3,2,6};
        int max=0;
        int k=0;
        while(k<arr.length){
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=i*arr[i];
        }
        if(sum>max){
            max=sum;
        }
        k++;
        }
        System.out.println(max);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
