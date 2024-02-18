package Day21.com;
import java.util.*;
public class AlternateDigitInIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),rev=0;
		rev=reverse(n);
		while(rev>0)
		{
			System.out.print(rev%10);
			rev/=100;
		}
		s.close();

	}
	public static int reverse(int n)
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=((sum*10)+r);
			n/=10;
		}
		return sum;
	}

}
