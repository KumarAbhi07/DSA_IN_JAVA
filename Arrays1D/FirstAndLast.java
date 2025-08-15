package Arrays1D;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,30,30,30,40,40};
        int target=40;
        firstandlast(arr,target);
    }
    public static void firstandlast(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int first=0;
        int last=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                first = mid;
                end=mid-1;
            }
        }
        System.out.println(first);

        start=0;
        end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                last = mid;
                start=mid+1;
            }
        }
        System.out.println(last);
        }
    }

