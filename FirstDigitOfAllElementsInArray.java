package Day16.com;
import java.util.*;
public class FirstDigitOfAllElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			int p=(int)Math.floor(Math.log10(a[i]));
			int r=(int)Math.pow(10,p);
			System.out.println(a[i]/r);
		}
		s.close();
	}

}
