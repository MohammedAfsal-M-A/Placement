package Day13.com;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		if(n==m)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
			int u=0,l=0,r=0,d=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(i<j)
					{
						if(i+j==m-1)
						{
							/*sample*/
						}
						else if(i+j>m-1)
						{
							r+=a[i][j];
						}
						else
						{
							u+=a[i][j];
						}
					}
					if(i>j)
					{
						if(i+j==m-1)
						{
							/*sample*/
						}
						else if(i+j>m-1)
						{
							d+=a[i][j];
						}
						else
						{
							l+=a[i][j];
						}
					}
				}
			}
			System.out.print(u+" "+l+" "+d+" "+r);
		}
		s.close();

	}

}
