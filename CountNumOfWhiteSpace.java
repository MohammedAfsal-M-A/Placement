package Day19.com;
import java.util.*;
public class CountNumOfWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		printWithoutSpace(s2);
		System.out.print("No of White Space : "+FindTheGivenSentenseHasWhileSpace.whiteSpace(s2));
		s.close();

	}
	public static void printWithoutSpace(String s2[])
	{
		for(int i=0;i<s2.length;i++)
		{
			if(!s2[i].equals(""))
			System.out.print(s2[i]+" ");
		}
		System.out.println();
	}

}
