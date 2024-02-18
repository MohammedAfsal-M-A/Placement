package Day16.com;
import java.util.*;
public class FirstOffOfArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n],c=0,c1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		if(n%2==0) {
			for(int i=0;i<n;i++)
			{
				if(i<n/2)
					c+=a[i];
				else
					c1+=a[i];
				
			}
			if(c==c1)
				System.out.print("Yes");
			else
				System.out.print("No");
		}
		s.close();

	}

}
