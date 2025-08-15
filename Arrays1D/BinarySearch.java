package Arrays1D;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int target=70;
        System.out.println(binarysearch(arr, target));
    }
    public static int binarysearch(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
