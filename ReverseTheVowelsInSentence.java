package Day22.com;
import java.util.*;

public class ReverseTheVowelsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine().toLowerCase();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(rev(s2[i])+" ");
		}
		s.close();

	}
	public static String rev(String s1)
	{
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				s+=s1.charAt(i);
			}
		}
		s1=s1.replaceAll("(a|e|i|o|u)","1");
		int m=s.length()-1;
		while(m>=0)
		{
			s1=s1.replaceFirst("1",""+s.charAt(m));
			m--;
		}
		return s1;
	}

}
