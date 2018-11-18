package CodeWars.WriteNumberInExpandedForm;

public class App {

    public static String expandedForm(int num)
    {
               StringBuilder sb = new StringBuilder();


               int i = 0;

        while (num > 0){
            if ( num%10 !=0) {
                int number = (int) ((num % 10) * Math.pow(10, i));
                String s = String.valueOf(number);
                StringBuilder sbb = new StringBuilder();
                sbb.append(s).reverse();
                sb.append(sbb);

                sb.append(" + ");
            }
            i++;
            num /=10;
    }
    sb.delete((sb.lastIndexOf(" + ")),sb.length());

    return sb.reverse().toString();
    }

}
