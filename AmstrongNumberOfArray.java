package Day16.com;
import java.util.*;
public class AmstrongNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			int p=(int)Math.floor(Math.log10(a[i]))+1,sum=0,l=a[i];
			while(a[i]>0)
			{
				int r=a[i]%10;
				sum+=((int)Math.pow(r, p));
				a[i]/=10;
			}
			if(sum==l)
				System.out.print(l+": Yes");
			else
				System.out.print(l+": No");
		}
		s.close();

	}

}
