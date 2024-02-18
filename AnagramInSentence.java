package Day22.com;
import java.util.*;

public class AnagramInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length-1;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].length()==s2[j].length())
				{
					boolean b=anagram(s2[i],s2[j]);
					if(b)
						System.out.println(s2[i]+" "+s2[j]+" is an Anagram.");
				}
			}
		}
		s.close();

	}
	public static boolean anagram(String s1,String s2)
	{
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		return Arrays.equals(ch,ch1);
	}

}
