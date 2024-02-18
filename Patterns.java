package Day11.com;
import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
					System.out.print("* ");
				else
					System.out.print("@ ");
			}
			System.out.println();
		}
		System.out.println();
		int p=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
				p+=2;
			}
			System.out.println();
		}
		System.out.println();
		p=0;
		int r=0;
		for(int i=1;i<=n;i++)
		{
			p=r;
			int l=(int)Math.pow(2,i-1);
			p+=l;
			r=p;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
				p+=l;
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
					System.out.print((char)(j+64)+" ");		
				else
					System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n)
				{
					System.out.print("  ");
				}
				else
					System.out.print((char)(i+j-n+64)+" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				System.out.print("* ");
				else
				System.out.print("@ ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			p=0;
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n)
					System.out.print("  ");
				else
				{
					System.out.print((char)(i+j-n+64)+" ");
					p=i+j-n+64-1;
				}
			}
			for(int j=1;j<i;j++)
			{
				System.out.print((char)p+" ");
				p--;
			}
			System.out.println();
		}
		System.out.println();
		p=0;
		for(int i=1;i<=n;i++)
		{
			r=p;
			for(int j=1;j<=i;j++)
			{
				System.out.print(r+" ");
				r++;
			}
			System.out.println();
			p++;
		}
		System.out.println();
		char c='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n)
					System.out.print("  ");
				else
				{
					System.out.print(c+" ");
					c++;
				}
			}
			System.out.println();
		}
		System.out.println();
		p=(n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(p+64)+" ");
				p--;
			}
			System.out.println();
		}
		s.close();
	}
	

}
