package Day18.com;
import java.util.*;
public class SearchElementAndPrintTheIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int m=s.nextInt();
		int p=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]==m)
			{
				p=i;
				break;
			}
		}
		System.out.print(p);
		s.close();

	}

}
