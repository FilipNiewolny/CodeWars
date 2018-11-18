package CodeWars.SumOfNumbers;

public class Sum {

    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }


        if (a > b) {
            int c = 0;
        while (a >= b) {
                c += b;
                b++;
            }
            return c;

        } else {
            int c = 0;
        while (b >= a) {
                c += a;
                a++;
            }
            return c;

        }

    }
}
