package Arrays1D;

public class Kthsmallestelement {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findkth(arr,4));


    }
    public static int findkth(int[][] arr,int k){
        int i=0;
        int j=0;
        if (k<arr.length){
            i=0;
            j=k-1;
        }
        else if(k>arr.length){
            i=arr.length-k;
            j=k-1;
        }
        return arr[i][k-1];

    }
}
