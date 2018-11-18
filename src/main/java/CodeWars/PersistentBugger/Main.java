package CodeWars.PersistentBugger;


public class Main {
    public static int persistence(long n) {
        int k = 0;

        while (n > 9) {
            long sum = 1;
            while (n > 0) {
                sum = sum * (n % 10);
                n /= 10;
            }
            n = sum;
            k++;
        }

        return k;
    }
}
