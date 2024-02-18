package Day18.com;
import java.util.*;
public class MergeTwoDiffArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n*2;i++)
		{
			if(i<n)
				a[i]=s.nextInt();
			else
				b[i-n]=s.nextInt();
		}
		int c[]=merge(a,b);
	    for(int i=0;i<n*2;i++)
	    {
	    	System.out.print(c[i]+" ");
	    }
	    s.close();

	}
	public static int[] merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length+b.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
				c[i]=b[i-a.length];
		}
		return c;
	}

}
