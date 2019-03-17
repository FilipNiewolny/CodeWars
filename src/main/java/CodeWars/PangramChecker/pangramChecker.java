package CodeWars.PangramChecker;

import java.util.Arrays;

public class pangramChecker {
    public static void main(String[] args) {

        String abc = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(abc));
    }

    public static boolean check(String sentence){
       Long c = sentence.toLowerCase().chars()
               .filter(letter-> letter >= 'a' && letter <= 'z')
               .distinct()
               .count();
       return c ==26;
    }
}
