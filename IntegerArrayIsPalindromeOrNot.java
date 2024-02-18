package Day17.com;
import java.util.*;
public class IntegerArrayIsPalindromeOrNot {

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
			int p=palindrome(a[i]);
			if(p==a[i])
				System.out.println(a[i]+" is palindrome");
			else
				System.out.println(a[i]+" is not palindrome");
				
		}
		s.close();

	}
	public static int palindrome(int n)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		return sum;
	}

}
