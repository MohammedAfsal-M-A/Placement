package Day20.com;
import java.util.*;
public class ReverseIndividualWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			StringBuilder p=new StringBuilder(s2[i]);
			System.out.print(p.reverse().toString()+" ");
		}
		s.close();

	}

}
