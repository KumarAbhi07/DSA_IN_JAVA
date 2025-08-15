package Arrays1D;

public class CelingAndFloor {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,75,80,90,100};
        int target=77;
        celingandfloor(arr,target);
    }
    public static void celingandfloor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int ceil=0;
        int floor=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
        }
        ceil=arr[end];
        floor=arr[start];
        System.out.println(ceil);
        System.out.println(floor);


    }
}
