import java.util.ArrayList;
import java.util.List;

public class IntegerPalendrom {
    public static boolean isPalindrome(int x) {
        List<Integer> arr = new ArrayList();
        boolean result = true;
        int y=x;
        if(x<0)
            y = x * (-1);
        while (y > 0) {
            arr.add(y % 10);
            y = y / 10;
        }
        int l = 0;
        int r = arr.size() - 1;
        if (x < 0)
            arr.add(arr.get(arr.size()-1), arr.get(arr.size()-1)*(-1));

        while (l < r) {
            if (arr.get(l) != arr.get(r))
            {
                result = false;
                break;
            }
            else {
                l++;
                r--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = -1;
        System.out.println(isPalindrome(x));


    }

}

