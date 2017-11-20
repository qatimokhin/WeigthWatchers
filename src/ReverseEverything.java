/**
 * Created by igortimokhin on 11/16/17.
 */
public class ReverseEverything {
    public static String s = "hope you are doing well";

    public static void main(String[] args) {
        System.out.println(reverseEverything(s));
    }
    public static String reverseEverything(String s) {

        char[] ch1 = s.toCharArray();
        char[] ch2 = new char[ch1.length];
        int j = 0;
            for (int i = ch1.length - 1; i >= 0; i--) {
                ch2[j] = ch1[i];
                j++;
            }
                return new String(ch2);
    }
}