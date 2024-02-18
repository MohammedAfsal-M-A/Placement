package Day19.com;
import java.util.*;
public class OccuranceOfCharPosInString {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char ch=s.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			if(ch==s1.charAt(i))
			{
				System.out.print(i+" ");
			}
		}
		s.close();
	}

}
