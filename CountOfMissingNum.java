package Day16.com;
import java.util.*;
public class CountOfMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.print(a[n-1]-a.length);
		s.close();

	}

}
