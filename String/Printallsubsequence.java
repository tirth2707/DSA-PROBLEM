import java.util.*;
class Printallsubseqvence {

    public static void findsubsequences(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println("FINAL==" + ans);
            return;
        }
        findsubsequences(s.substring(1), ans + s.charAt(0));
        System.out.println(s.substring(1));
        System.out.println(" ans + s.charAt(0)"+ (ans + s.charAt(0)));
        findsubsequences(s.substring(1), ans);

    }
    public static void main(String args[])
    {
        String s = "abcd";
        findsubsequences(s, "");    
    }
    
}
