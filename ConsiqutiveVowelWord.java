package Day20.com;
import java.util.*;
public class ConsiqutiveVowelWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			if(vowels(s2[i]))
				System.out.println(s2[i]);
		}
		s.close();

	}
	public static boolean vowels(String s1)
	{
		s1=s1.toLowerCase();
		char ch[]=s1.toCharArray();
		boolean b=false;
		for(int i=0;i<ch.length-1;i++)
		{
			if((ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')&&(ch[i+1]=='a'||ch[i+1]=='e'||ch[i+1]=='i'||ch[i+1]=='o'||ch[i+1]=='u'))
			{
				b=true;
				break;
			}
		}
		return b;
	}

}
