package Day22.com;
import java.util.*;
public class CountOfWordsDigitsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		System.out.println("The Sentence contains "+s2.length+" words");
		int a[]=checkSentence(s1);
		System.out.println("The Sentence contains "+a[0]+" Digits");
		System.out.println("The Sentence contains "+a[1]+" Vowels");
		System.out.println("The Sentence contains "+a[2]+" Consonents");
		s.close();
	}
	public static int[] checkSentence(String s)
	{
		int a=0,b=0,c=0;
		int r[]=new int[3];
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				a++;
			}
			else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				b++;
			}
			else if(Character.isAlphabetic(s.charAt(i)))
			{
				c++;
			}
			
		}
		r[0]=a;
		r[1]=b;
		r[2]=c;
		return r;
	}

}
