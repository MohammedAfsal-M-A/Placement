package Day17.com;
import java.util.*;
public class PrintASCIICharInArray {

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
			if(a[i]>=65&&a[i]<=130)
				System.out.println(a[i]+" : "+(char)a[i]);
		}
		s.close();

	}

}
