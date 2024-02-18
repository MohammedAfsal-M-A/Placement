package Day22.com;
import java.util.*;
public class StringContainsOnlyVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next().toLowerCase().replaceAll("(a|e|i|o|u)","0");
		try {
			int p=Integer.parseInt(s1);
			if(p==0)
				System.out.print("Yes");
		}
		catch(Exception e)
		{
			System.out.print("No");
		}
		s.close();

	}

}
