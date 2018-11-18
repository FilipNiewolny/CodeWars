package CodeWars.StopGninnipSMySdrow;

public class SpinWords {
    public String spinWords(String sentece){
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = sentece.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > 4){

                stringBuilder.append(new StringBuilder(s[i]).reverse());
            }
            else {
                stringBuilder.append(s[i]);
            }
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" "));
        return stringBuilder.toString();
    }
}
