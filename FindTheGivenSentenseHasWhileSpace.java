package Day19.com;
import java.util.*;

public class FindTheGivenSentenseHasWhileSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		if(0==whiteSpace(s2))
			System.out.print("Given Sentense is correct");
		else
			System.out.print("Not correct");
		s.close();

	}
	public static int whiteSpace(String s2[])
	{
		int b=0;
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].equals(""))
			{
				b++;
			}
		}
		return b;
		
	}
}
