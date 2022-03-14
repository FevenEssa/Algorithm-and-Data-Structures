import java.util.*;
public class FraudNotice {
    public static int activityNotifications(List<Integer> expenditure, int d)     {
        // Write your code here
        int notice=0;
        int[] counter = new int[201];
        for(int i=0; i<d; i++)
            counter[expenditure.get(i)]++;
        for(int i=d; i<expenditure.size(); i++){
            int median = getMedian(counter);
            System.out.println("median is " + median + " next to remove is " + expenditure.get(i-d));
            counter[expenditure.get(i-d)]--;
            counter[expenditure.get(i)]++;
        }
        System.out.println(getMedian(counter));
        return notice;
    }
    public static int getMedian(int[] exp) {
        int sum = 0;
        for(int i = 0; i < exp.length; i++) {
            sum += exp[i];
        }
         int medianIdx = (sum + 1)/2;
         return findNonZeroNext(exp, medianIdx);
    }

    public static int findNonZeroNext(int[] exp, int medianIdx){
        int i = 0;
        for(;i< exp.length;i++){
            if (exp[i] != 0){
                medianIdx -= exp[i];
            }
            if(medianIdx <= 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        List<Integer> expenditure = new ArrayList<>();

        expenditure.add(2);
        expenditure.add(3);
        expenditure.add(4);
        expenditure.add(2);
        expenditure.add(3);
        expenditure.add(6);
        expenditure.add(8);
        expenditure.add(4);
        expenditure.add(5);

        int d =5;

        System.out.println("Notice sent "+activityNotifications(expenditure, d) +" times.");
    }
}
