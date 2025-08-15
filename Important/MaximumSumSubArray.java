package Important;


public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr={3,-4,5,4,-1,7,-8};
        int m=maximumSum(arr);
        System.out.println(m);

    }
    public static int maximumSum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int curr=0;

        //            int curr=0;
        //            for (int j = i; j <arr.length ; j++) {
        //                curr+=arr[j];
        //                maxSum=Math.max(curr,maxSum);
        //
        //            }

        //kadane algorithm
        for (int i = 0; i < arr.length; i++){
            curr += arr[i];
            maxSum=Math.max(curr,maxSum);
            if(curr<0){
                curr=0;
            }
        }
        return maxSum;

    }
}
