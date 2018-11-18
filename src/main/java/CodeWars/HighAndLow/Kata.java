package CodeWars.HighAndLow;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Kata {
    public static String HighAndLow(String numbers){
                IntSummaryStatistics stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return String.format("%d %d", stats.getMax() , stats.getMin());


    }


}
