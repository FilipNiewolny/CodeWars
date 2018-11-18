package CodeWars.WriteNumberInExpandedForm;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Polishing {


    public static String expandedForm(int num){
        return IntStream.range(0,String.valueOf(num).length())
                .mapToObj(x -> String.valueOf( Character.getNumericValue(String.valueOf(num).charAt(x) ) * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
                .filter(x -> !x.equals("0"))
                .collect(Collectors.joining(" + "));
    }

}
