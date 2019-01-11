package CodeWars.RectangleIntoSquares;

import org.apache.commons.math3.primes.Primes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> sqInRect(int lng, int wdth) {
        // your code
        if( lng == wdth){
            return null;
        }
        List<Integer> lista = new ArrayList<>();
        while (lng >0 && wdth >0){
            lista.add(Math.min(lng,wdth));
            if (wdth>lng)wdth=wdth-lng ;
        else lng=lng-wdth;
        }

        return lista;
    }
}
