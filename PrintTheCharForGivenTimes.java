package Day22.com;
import java.util.*;
public class PrintTheCharForGivenTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		System.out.print(CharOcc(s1));
		s.close();

	}
	public static String CharOcc(String s1)
	{
		String r="",c="";
		int p=0;
		for(int i=1;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				c+=s1.charAt(i);
			}
			else
			{
				for(int j=0;j<Integer.parseInt(c);j++)
				{
					r+=s1.charAt(p);
				}
				r+=" ";
				p=i;
				c="";
			}
		}
		for(int i=0;i<Integer.parseInt(c);i++)
			r+=s1.charAt(p);
		return r;
	}

}
