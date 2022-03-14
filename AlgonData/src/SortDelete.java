public class SortDelete {
    public static boolean solution(int[] sequence) {
        int count=0;
        for(int i=0; i<sequence.length; i++){
            for(int j=1; j<sequence.length; j++){
                if(sequence[j]<sequence[j-1]){
                    int temp=sequence[j];
                    sequence[j]=sequence[j-1];
                    sequence[j-1]=temp;
                    count++;
                }
            }
        }
        return (count > 1) ? false : true;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2};
        System.out.println(solution(nums));
        for(int num:nums) System.out.println(num + " ");
    }
}
