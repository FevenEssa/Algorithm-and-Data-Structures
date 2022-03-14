import java.util.Arrays;

public class SingleNumber {
    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[2];
        int i=0;
        int j=1;
        while(j<nums.length && i<j)
            if(nums[i] != nums[j]){
                result[0] = i;
                result[1] = j;
                break;
            }
            else{
                i+=2;
                j+=2;
            }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(singleNumber(nums));
    }
}
