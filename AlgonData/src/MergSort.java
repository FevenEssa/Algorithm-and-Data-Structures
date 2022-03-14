import java.util.Arrays;

public class MergSort {
    public static void mergSort(int[] arr, int lb, int ub){
        if(lb==ub)
            return;
        else{
            int mid=(lb+ub)/2;
            mergSort(arr, lb, mid);
            mergSort(arr, mid+1, ub);
            merg(arr, lb, mid, ub);
        }
    }
    public static void merg(int[] arr, int lb, int mid, int ub){
        int[] b = new int[arr.length];
        for(int k=lb; k<=ub; k++) b[k]=arr[k];

        int i=lb;
        int j=mid+1;
        int k=lb;
        while(i<=mid && j<=ub){
            if(b[i]<=b[j]) {
                arr[k] = b[i];
                i++;
            }
            else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<ub){
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        else if(j>ub){
            while(i<mid){
                arr[k]=b[i];
                k++;
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[]={5, 6, 89, 67, 30,2,6,0, 20};
        mergSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
