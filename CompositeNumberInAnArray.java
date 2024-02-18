package Day16.com;
import java.util.*;
public class CompositeNumberInAnArray {

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
			if(PrimeNumbersInArray.prime(a[i])==-1)
				System.out.println(a[i]+" : Yes");
			else if(PrimeNumbersInArray.prime(a[i])==1)
				System.out.println("Nither prime nor composite");
			else
				System.out.println(a[i]+" : No");
		}
		s.close();

	}

}
