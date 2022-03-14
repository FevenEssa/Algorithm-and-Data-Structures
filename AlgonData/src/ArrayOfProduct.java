import java.util.Arrays;

public class ArrayOfProduct {
    // O(n) time | O(n) space.
    public static int[] prodArrayExceptSelf(int[] arr){
        int leftProduct = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }
        int rightProd = 1;
        for (int i = arr.length -1; i >= 0; i--){
            result[i] *= rightProd;
            rightProd *= arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, -1, 0, 8};
        Arrays.stream(prodArrayExceptSelf(input)).forEach(System.out::println);
    }
}
