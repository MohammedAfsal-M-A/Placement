package Day16.com;
import java.util.*;
public class HarshedElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			int p=a[i],sum=0;
			while(p>9)
			{
				int r=p;
				while(r>0)
				{
					int q=r%10;
					sum+=q;
					r/=10;
				}
				p=sum;
			}
			if(a[i]%p==0)
				System.out.println(a[i]+": Yes");		
			else
				System.out.println(a[i]+": No");
		}
		s.close();

	}

}
