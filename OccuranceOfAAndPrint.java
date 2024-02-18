package Day19.com;
import java.util.*;
public class OccuranceOfAAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine().toLowerCase();
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		if(s1.contains("a"))
		{
			int b=0;
			for(int i=0;i<c.length;i++)
			{
				if(c[i]=='a')
				{
					b++;
				}
				else
					break;
			}
			System.out.print("a : "+b);
		}
		s.close();

	}

}
