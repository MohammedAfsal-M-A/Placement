package Day22.com;
import java.util.*;
public class ReplaceAllOneWithNineWithoutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(replaceOneWithNine(n));
		s.close();

	}
	public static int replaceOneWithNine(int n)
	{
		int p=0;
		int a[]=new int[(int)Math.floor(Math.log10(n))+1];
		for(int i=a.length-1;i>=0;i--)
		{
			int r=n%10;
			if(r==1)
				a[i]=9;
			else
				a[i]=r;
			n/=10;
		}
		for(int i=0;i<a.length;i++)
		{
			p=(p*10)+a[i];
		}
		return p;
	}

}
