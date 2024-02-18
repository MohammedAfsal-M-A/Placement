package Day22.com;
import java.util.*;
public class FindTheOccuraneOfChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine().trim();
		System.out.print(countOfChar(s1));
		s.close();
		

	}
	public static String countOfChar(String s1)
	{
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		String p="";
		int c1=1;
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]==c[i+1])
			{
				c1++;
			}
			else
			{
				p+=c[i]+""+c1;
				c1=1;
			}
		}
		p+=c[c.length-1]+""+c1;
		return p;
	}

}
