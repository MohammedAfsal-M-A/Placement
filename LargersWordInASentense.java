package Day19.com;
import java.util.*;
public class LargersWordInASentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine(),s3="";
		int b=0;
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].length()>b)
			{
				b=s2[i].length();
				s3=s2[i];
			}
		}
		System.out.print(s3+" : "+b);
		s.close();

	}

}
