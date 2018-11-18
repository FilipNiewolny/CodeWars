package CodeWars.StopGninnipSMySdrow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BetterSolution {
    public String spinWords(String sentence){
        return Arrays.stream(sentence.split(" "))
                .map(x -> x.length() >4 ? new StringBuilder(x).reverse().toString() : x)
                .collect(Collectors.joining(" "));
    }

}
