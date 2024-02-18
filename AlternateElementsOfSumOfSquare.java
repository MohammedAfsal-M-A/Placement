package Day18.com;
import java.util.*;
public class AlternateElementsOfSumOfSquare {

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
			System.out.print(sumSquare(a[i])+" ");
		}
		s.close();

	}
	public static int sumSquare(int a)
	{
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			sum+=(int)Math.sqrt(r);
			a/=10;
		}
		return sum;
	}

}
