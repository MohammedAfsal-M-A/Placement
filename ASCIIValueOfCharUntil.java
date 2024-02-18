package Day10.com;
import java.util.*;
public class ASCIIValueOfCharUntil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean b=true;
		do {
			int n=s.nextInt();
			if(n==1)
				b=false;
			else
				System.out.println((char)n);
		}
		while(b);
		s.close();

	}

}
