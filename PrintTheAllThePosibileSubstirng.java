package Day19.com;
import java.util.*;
public class PrintTheAllThePosibileSubstirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=0;j<=s1.length()-i;j++)
			{	
				System.out.println(s1.substring(j,j+i));
			}
		}
		s.close();

	}

}
