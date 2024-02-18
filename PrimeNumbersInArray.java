package Day16.com;
import java.util.*;
public class PrimeNumbersInArray {

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
			if((prime(a[i]))==1)
			{
				System.out.println("Neither prime nor composite");
			}
			else if((prime(a[i]))>1)
					System.out.println("yes");
			else
				System.out.println("No");
		}
		s.close();

	}
	public static int prime(int n)
	{
		boolean b=false;
		if(n==1||n==2||n==3)
		{
			return n;
		}
		else
		{
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%2!=0)
			{
				b=true;
			}
		}
		if(b)
			return n;
		else
			return -1;
		}
	}

}
