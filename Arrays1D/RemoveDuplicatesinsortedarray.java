package Arrays1D;

import java.util.Arrays;

public class RemoveDuplicatesinsortedarray {
    public static int removeduplicates(int[] nums){
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
            
        }
        return j+1;
    }


    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,4,5};
        System.out.println(removeduplicates(arr));
    }
}
