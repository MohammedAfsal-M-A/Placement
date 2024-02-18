package Day19.com;
import java.util.*;
public class ReplaceAllVowelsAndUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print(s.next().replaceAll("(a|e|i|o|u|A|E|I|O|U)","@").replaceAll("[A-Z]","S"));;
		s.close();
	}

}
