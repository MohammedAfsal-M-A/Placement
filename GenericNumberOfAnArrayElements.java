package Day17.com;
import java.util.*;
public class GenericNumberOfAnArrayElements {

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
			int p=generic(a[i]);
			System.out.println(p);
		}
		s.close();

	}
	public static int generic(int n)
	{
		int p=n;
		while(p>9)
		{
			int r=p,sum=0;
			while(r>0)
			{
				int l=r%10;
				sum+=l;
				r/=10;
			}
			p=sum;
		}
		return p;
	}

}
