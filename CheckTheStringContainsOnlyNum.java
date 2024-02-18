package Day19.com;
import java.util.*;
public class CheckTheStringContainsOnlyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		try {
			int n=Integer.parseInt(s1);
			System.out.print(n);
		}
		catch(Exception e)
		{
			System.out.print("Not an Integer");
		}
		s.close();

	}

}
