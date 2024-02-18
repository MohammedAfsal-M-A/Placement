package Day18.com;
import java.util.*;
public class SwapPosOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=(int)Math.floor(Math.log10(n))+1;
		int r=p/2;
		int l=(int)Math.pow(10,r);
		System.out.print(n%l);
		if(p%2!=0)
			System.out.print((n/l)%10+""+(n/(l*10)));
		else
			System.out.print(n/l);
		s.close();

	}

}
