package CodeWars.GiveMeDiamond;

public class Diamond {

    public static void main(String[] args) {

        System.out.println(print(5));
    }


    public static String print(int n) {

        if (n > 0 && n % 2 != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                StringBuilder tmp = new StringBuilder();
                if (i < (n / 2) + 1) {
                    for (int j = 0; j <= i * 2; j++) {
                        tmp.append("*");
                    }
                    while (tmp.toString().length() - i < ((n / 2) + 1))
                        tmp.insert(0, " ");
                } else {
                    for (int j = 0; j < 2 * (n - i) - 1; j++) {
                        tmp.append("*");
                    }
                    while (tmp.toString().length() - (n - i) + 1 < ((n / 2) + 1))
                        tmp.insert(0, " ");
                }
                sb.append(tmp.toString());
                sb.append("\n");

            }

            return sb.toString();
        } else return null;
    }
}
