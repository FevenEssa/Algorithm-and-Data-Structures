import java.util.Arrays;

public class FindKequalSum {
   public static boolean findkSum(int[] arr, int k){
      int sum = 0;
      for(int i=0; i<arr.length; i++){
         sum+=arr[i];
      }
      int target = sum/k;
      boolean[] used = new boolean[arr.length];
      Arrays.fill(used, Boolean.FALSE);
      return backTrack(0, k, 0, target, used, arr);
   }
   public static boolean backTrack(int i, int k, int subSetSum, int target, boolean[] used, int[] arr)
   {
      if(k==0)
         return true;
      if(subSetSum>target)
         return backTrack(0, k-1, 0, target, used, arr);
      for(int j=i; j<arr.length; j++){
         subSetSum+=arr[i];

      }
      return false;
   }
}
