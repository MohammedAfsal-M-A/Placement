package Day18.com;
import java.util.*;
public class ElementOccranceFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char a[]=new char[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.next().charAt(0);
		}
		for(int i=0;i<n-1;i++)
		{
			int p=1;
			for(int j=i+1;j<n;j++)
			{
				if(Character.isDigit(a[i]))
				{
					if(a[i]==a[j])
					{
						p++;
						a[j]='a';
					}
				}
			}
			System.out.println(a[i]+" = "+p);
		}
		s.close();

	}

}
