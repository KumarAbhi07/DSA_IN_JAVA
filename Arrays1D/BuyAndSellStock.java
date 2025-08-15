package Arrays1D;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxprofit(arr));


    }
    public static int maxprofit(int[] arr){
        int min=arr[0];
        int profit=0;
        for(int i=1;i<arr.length-1;i++){
            min=Math.min(min,arr[i]);
            profit=Math.max(profit,arr[i]-min);
        }
        return profit;
    }
}
