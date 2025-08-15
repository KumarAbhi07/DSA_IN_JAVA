package Arrays1D;

public class SpanArray {
    //difference of max - min
    public static void main(String[] args) {
        int[] arr={4,6,12,2,9,14};
        int max= Integer.MIN_VALUE;
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            else if (arr[i]<min) {
                min=arr[i];
            }
        }
       // System.out.println(max);
       //System.out.println(min);
        System.out.println(max-min);


    }
}
