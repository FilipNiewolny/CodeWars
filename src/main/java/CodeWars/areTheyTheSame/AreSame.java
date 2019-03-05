package CodeWars.areTheyTheSame;

import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{};
        int[] b = null;

        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if ((b != null && a != null) && a.length == b.length) {
                for (int i = 0; i < a.length; i++) {
                    int y = 0;
                    while (b.length != y) {
                        if (Math.abs(a[i]) == Math.sqrt(b[y])) {
                            a[i] = 0;
                            b[y] = 0;
                            break;
                        }
                        y++;

                    }
                    ;
                }
                if (Arrays.stream(b).sum() == 0 && Arrays.stream(a).sum() == 0) {
                    return true;
                }
            }
            return false;

    }

    public static boolean compBetter(int[] a , int[] b){
        return a!= null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray() , Arrays.stream(b).sorted().toArray());
    }
}
