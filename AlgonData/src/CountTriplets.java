import java.util.ArrayList;
import java.util.List;

public class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {
        long count=0;
        for(int i=0; i<arr.size(); i++){
            for(int j=i; j<arr.size()-1; j++){
                if(arr.get(j)*r==arr.get(j+1))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Long> arr= new ArrayList<Long>();

        arr.add(1L);
        arr.add(3L);
        arr.add(9L);
        arr.add(9L);
        arr.add(27L);
        arr.add(81L);

        int r=3;
        System.out.println(countTriplets(arr, r));
    }
}
