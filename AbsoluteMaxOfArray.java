package Day18.com;
import java.util.*;
public class AbsoluteMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=AbsMax(a);
		System.out.print(b[01]+" - "+b[2]+" = "+b[0]);
		s.close();

	}
	public static int[] AbsMax(int a[])
	{
		int b=0;
		int c[]=new int[3];
		int r=0,l=0;
		for(int i=0;i<a.length-1;i++)
		{
			int p=(int)Math.abs(a[i]-a[i+1]);
			if(b<p)
			{
				b=p;
				r=a[i];
				l=a[i+1];
			}
		}
		c[0]=b;
		c[1]=r;
		c[2]=l;
		return c;
	}

}
