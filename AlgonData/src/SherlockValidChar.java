import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockValidChar {
        /*
         * Complete the 'isValid' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String isValid(String s) {
            // Write your code here
            Map<Character, Integer> chHash = toHashMap(s);
            int[] arr=new int[chHash.size()];
            int index = 0;
            for(Map.Entry<Character, Integer> entry : chHash.entrySet()){
                arr[index++]=entry.getValue();
            }
            Arrays.sort(arr);

            if(arr.length == 1)return "YES";

            if(arr[0]==arr[arr.length-1])return "YES";

            if(arr[0]==1 && arr[1]==arr[arr.length-1])return "YES";

            if(arr[0]==arr[1] && arr[1] == arr[arr.length-2]&& arr[arr.length-1]==arr[arr.length-2]+1)return "YES";

            return "NO";
        }

        public static Map<Character, Integer> toHashMap(String str)
        {
            Map<Character, Integer> chHash = new HashMap<>();
            char charA[] = str.toCharArray();
            Arrays.sort(charA);
            for (int i = 0; i < str.length(); i++)
            {
                Integer val = chHash.get(charA[i]);
                if (val != null)
                    chHash.put(charA[i], new Integer(val + 1));
                else
                    chHash.put(charA[i], 1);
            }
            return chHash;
        }

        public static void main(String[] args) {
            String s= "aaiillhhy";
            String str = "kjlkjiuh";
            System.out.println("Is s valid? "+isValid(s));
            System.out.println("Is str valid? "+isValid(str));
        }

}

