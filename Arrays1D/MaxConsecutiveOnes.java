package Arrays1D;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,0,1,1,1,0,1,1,1,1,1};
        int count =0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                if(count>maxcount){
                    maxcount=count;
                }
                count=0;
            }
        }
        if(count>maxcount){
            maxcount=count;
        }
        System.out.println(maxcount);
    }
}
