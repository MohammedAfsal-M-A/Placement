package Day18.com;
import java.util.*;
public class AlternateElementsInDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		char b[]=order(a);
		int p=b.length;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.print(b[p]+" ");
				p--;
			}
			else
				System.out.print(a[i]);
		}
		s.close();

	}
	public static char[] order(int[] a)
	{
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				s1+=a[i];
		}
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		return c;
	}

}
