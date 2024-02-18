package Day17.com;
import java.util.*;
public class FirstAndLastElementsOfIndividualElementsInArray {

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
			int p=sumOfFirstAndLast(a[i]);
			System.out.println(a[i]+" : "+p);
		}
		s.close();

	}
	public static int sumOfFirstAndLast(int n)
	{
		int p=(int)Math.floor(Math.log10(n));
		int r=(int)Math.pow(10,p);
		return ((n%10)+(n/r));
	}

}
