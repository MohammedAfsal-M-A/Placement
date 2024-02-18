package Day16.com;
import java.util.*;
public class PrimeFactorOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" : ");
			for(int j=1;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					if(PrimeNumbersInArray.prime(j)>1)
					System.out.print(PrimeNumbersInArray.prime(j)+" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
