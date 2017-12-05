/**
 * Created by igortimokhin on 12/5/17.
 */
public class ReverseEverythingV2 {

    private static String str="i hope you are doing well";

    public static void main(String[] args) {

        System.out.println(reverseEverything1(str));
        System.out.println(reverseEverything2(str));
    }
    public static String reverseEverything1(String s){

        String st="";
        for (int i=s.length()-1; i>=0; i--)

            st=st+s.charAt(i);
        
        return st;
    }
    public static StringBuffer reverseEverything2(String s){
        StringBuffer sb=new StringBuffer(s);
        return sb.reverse();
    }


}
