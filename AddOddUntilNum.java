package Day10.com;
import java.util.*;

public class AddOddUntilNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0;
		boolean b=true;
		do {
			int n=s.nextInt();
			if(n==-1)
				b=false;
			else
			{
				if(n%2!=0)
					sum+=n;
			}
		}
		while(b);
		System.out.print(sum);
		s.close();

	}

}
