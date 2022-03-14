

import java.util.*;

public class MissingNumber {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freq1= new HashMap<>();
        Map<Integer, Integer> freq2= new HashMap<>();

        for(int i=0; i<arr.size(); i++){
            Integer val= freq1.get(arr.get(i));

            if(val != null)
                freq1.put(arr.get(i), val+1);
            else
                freq1.put(arr.get(i), 1);
        }
        for(int i=0; i<arr.size(); i++){
            Integer val= freq2.get(brr.get(i));

            if(val != null)
                freq2.put(brr.get(i), val+1);
            else
                freq2.put(brr.get(i), 1);
        }

        for(Map.Entry<Integer, Integer> entry : freq2.entrySet())
        {
            Integer key1 = entry.getKey();
            if(freq1.get(key1) == null || entry.getValue() > freq1.get(key1) ){
                result.add(key1);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> brr = new ArrayList<Integer>();
        arr.add(7);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(5);
        arr.add(3);

        brr.add(7);
        brr.add(2);
        brr.add(2);
        brr.add(5);
        brr.add(4);
        brr.add(6);
        brr.add(5);
        brr.add(3);
        brr.add(3);

        List<Integer> result = missingNumbers(arr, brr);

        System.out.println(result);
    }

}
