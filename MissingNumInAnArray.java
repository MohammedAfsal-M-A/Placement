package Day16.com;
import java.util.*;
public class MissingNumInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			if(a[i]+1!=a[i+1])
			{
				System.out.print(a[i]+1);
				break;
			}
		}
		s.close();

	}

}
