package Day16.com;
import java.util.*;
public class ReverseIndividualDigitOfArrayElements {

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
			rev(a[i]);
		}
		s.close();

	}
	public static void rev(int n)
	{
		while(n>0)
		{
			int r=n%10;
			System.out.print(r);
			n/=10;
		}
		System.out.println();
	}

}
