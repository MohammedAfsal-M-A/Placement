import java.util.*;
public class Reverse
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String s1[]=str.split(" ");
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            System.out.print(s1[i]+" ");
            else
            {
                String p="";
                for(int j=s1[i].length()-1;j>=0;j++)
                {
                    p+=s1[i].chatAt(j);
                }
                System.out.print(p+" ");
            }
        }
    }
}