import java.util.*;

public class BubbleSort {
    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int swap=0;
        int n=a.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++)
            {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j+1)) {
                    Collections.swap(a, j, j+1);
                    swap++;
                }
            }
        }
        for (int k:a
             ) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(90);
        a.add(84);
        a.add(4);
        a.add(56);
        a.add(5);
        countSwaps(a);
    }
}

