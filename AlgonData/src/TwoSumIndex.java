import java.util.Arrays;
import java.util.HashMap;

public class TwoSumIndex {
    public static int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }

        for(int i = 0; i<nums.length; i++){
            if(target-nums[i] != nums[i] && map.containsKey(target - nums[i])){
                result[0]=map.get(target - nums[i]);
                result[1]=i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
