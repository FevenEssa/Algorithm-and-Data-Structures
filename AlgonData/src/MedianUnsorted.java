import java.util.Collections;
import java.util.PriorityQueue;

public class MedianUnsorted {
    public static int getMedian(int[] arr){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        int median;
        for (int i=0; i< arr.length; i++){
            if (minHeap.size() == maxHeap.size()) {
                maxHeap.add(arr[i]);
                minHeap.add(maxHeap.poll());
            } else {
                minHeap.add(arr[i]);
                maxHeap.add(minHeap.poll());
            }
        }

        if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return median;

    }
    public static void main(String[] args){
        int[] arr={0,4,24,1,9,0,36,7};
        System.out.println("The median is: " + getMedian(arr));
    }
}
