package Day15.com;
import java.util.*;
public class LastDigitOfAllElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt()%10;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		s.close();
	}

}