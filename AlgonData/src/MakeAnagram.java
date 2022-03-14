import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class MakeAnagram {

    /*

     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        // Write your code here

        HashMap<Character, Integer> hashA= toHashMap(a);
        HashMap<Character, Integer> hashB=toHashMap(b);

        int count = 0;
        for (char key : hashA.keySet())
        {
            if (hashB.containsKey(key) && hashA.get(key) == hashB.get(key)) {
                continue;
            }
            else if((hashB.containsKey(key) && hashA.get(key) != hashB.get(key)))
                count +=(Math.abs(hashA.get(key) - hashB.get(key)));
            else {
                count +=hashA.get(key);
            }
        }
        for (char key : hashB.keySet())
        {
            if (hashA.containsKey(key) ) {
                continue;
            } else {
                count += hashB.get(key);
            }
        }
        return count;
    }
    public static HashMap<Character, Integer> toHashMap(String str)
    {
        HashMap<Character, Integer> chHash = new HashMap<Character, Integer>();
        char charA[]=str.toCharArray();
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
public static void main(String[] args)
{
    String a = "abcdeg";
    String b = "kjkljab";
    System.out.println("Minimum no of deletion: " + makeAnagram(a, b));
}
}


