package Day22.com;
import java.util.*;
public class ExtractNumFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		System.out.print(s1.replaceAll("[^0-9]",""));
		s.close();

	}

}
