package Day20.com;
import java.util.*;
public class ReverseEntirSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.print(reverseAll(s1));
		s.close();

	}
	public static String reverseAll(String s1)
	{
		char s2[]=new char[s1.length()];
		String s3="";
		for(int i=0;i<s2.length;i++)
		{
			if(s1.charAt(i)==' ')
			{
				s2[i]=' ';
			}
			else
			{
				s3=s1.charAt(i)+s3;
				s2[i]='@';
			}
		}
		int m=0;
		String s4="";
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i]=='@')
			{
				s2[i]=s3.charAt(m);
				m++;
			}
			s4+=s2[i];
			
		}
		return s4;
		
	}

}
