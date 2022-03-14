import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stockProfit {
    public static int stockPairs(List<Integer> stocksProfit, long target) {
    int result =0;
    Set<Integer> profitSet= new HashSet<>();
    Set<Integer> visited = new HashSet<>();

        for(int i=0; i<stocksProfit.size(); i++){
        if(profitSet.contains((int)target - stocksProfit.get(i)) && !visited.contains(stocksProfit.get(i))){
            result++;
            profitSet.add((int)target - stocksProfit.get(i));
            visited.add(stocksProfit.get(i));
        }
        else if(!visited.contains(stocksProfit.get(i))){
            profitSet.add(stocksProfit.get(i));
        }
    }
        return result;
}
}
