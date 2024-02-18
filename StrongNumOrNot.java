package Day12.com;
import java.util.*;
public class StrongNumOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=fact(r);
			n/=10;
		}
		if(sum==n)
			System.out.print("YES");
		else
			System.out.print("NO");
		s.close();

	}
	public static int fact(int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum*=i;
		}
		return sum;
	}

}
