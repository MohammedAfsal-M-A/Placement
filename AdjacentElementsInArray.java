package Day15.com;
import java.util.*;

public class AdjacentElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int b[]=swap(a);
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		s.close();

	}
	public static int[] swap(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
		}
		return a;
	}

}
