package Day21.com;
import java.util.*;
public class FormNumInPrimeInGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0)
		{
			int r=n%10;
			if(r==2|r==3||r==7||r==5)
			{
				System.out.print(r+" ");
			}
			n/=10;
		}
		s.close();

	}

}
