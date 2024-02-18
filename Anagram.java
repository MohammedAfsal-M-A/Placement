import java.util.*;
public class Anagram
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String p="",s1=s.next();
        String p1="",str=s.next();
        if(s1.length()==str.length())
        {
            char ch[]=s1.toCharArray();
            char ch1[]=str.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            for(int i=0;i<ch.length;i++)
            {
                p+=ch[i];
                p1+=ch1[i];
            }
            if(p.equals(p1))
            System.out.print("YES");
            else
            System.out.print("NO");
        }
        else
        System.out.print("NO");

    }
}