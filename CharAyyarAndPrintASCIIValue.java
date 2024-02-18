package Day17.com;
import java.util.*;
public class CharAyyarAndPrintASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		char c[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			System.out.print((int)c[i]);		
		}
		s.close();

	}

}
