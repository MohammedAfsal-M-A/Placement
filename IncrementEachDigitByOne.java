package Day18.com;
import java.util.*;
public class IncrementEachDigitByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(inc(a[i])+" ");
		}
		s.close();

	}
	public static int inc(int n)
	{
		String s="";
		while(n>0)
		{
			int r=(n%10)+1;
			if((r-1)!=9)
			{
				s=r+s;
			}
			else
			{
				s=(r-1)+s;
			}
			n/=10;
		}
		return Integer.parseInt(s);
	}

}
