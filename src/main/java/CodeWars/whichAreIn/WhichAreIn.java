package CodeWars.whichAreIn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class WhichAreIn {


    public static void main(String[] args) {
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println(Arrays.toString(inArray(a1, a2)));

    }
    public static String[] inArray(String[] array1, String[] array2) {
        String[] tmp = new String[array1.length];

        int z = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])){
                  tmp[z] = array1[i];
                  z++;
                  break;
                }
            }
        }

        return  Arrays.stream(tmp).filter(Objects::nonNull).sorted().toArray(String[]::new);
    }

    public static String[] inArray2(String[] array1, String[] array2) {

        return Arrays.stream(array1).filter( s ->
                Arrays.stream(array2).anyMatch(z -> z.contains(s)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }




}
