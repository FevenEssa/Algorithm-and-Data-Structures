import java.util.*;
public class MaxNumOfToys {
    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int price = 0;
        int toys =0;
        while(price<k && toys<prices.size()){
            price+=prices.get(toys);
            toys++;
        }
        return toys-1;
    }

    public static void main(String[] args) {
        List<Integer> prices= new ArrayList<>();
        prices.add(56);
        prices.add(900);
        prices.add(4);
        prices.add(5);
        prices.add(90);
        prices.add(40);
        int k = 500;
        System.out.println("Maximum number of toys you can buy: "+ maximumToys(prices, k));
        prices.remove(0);

    }
}
