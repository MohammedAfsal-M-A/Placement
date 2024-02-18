package Day15.com;
import java.util.*;
public class ArrayEqqualsInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<(n*2);i++)
		{
			if(i<n)
				a[i]=s.nextInt();
			else
				b[i-n]=s.nextInt();
		}
		System.out.print(Arrays.equals(a, b));
		s.close();
	}

}
