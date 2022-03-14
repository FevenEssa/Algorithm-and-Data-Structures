public class EqualSumPivot {
    public static int equalSum(int[] arr){
        int total = 0, idx = -1;
        for (int each : arr){
            total += each;
        }
        int leftSum = 0;
        int rightSum;
        for (int i = 0; i < arr.length; i++){
              rightSum = total - leftSum - arr[i];
              if(leftSum == rightSum){
                    idx = i;
                    break;
              }
              leftSum += arr[i];
        }
        return idx;
    }
    public static void main(String[] args){
        int[] arr ={0, 2, 3, 5};
        System.out.println(equalSum(arr));
    }
}

