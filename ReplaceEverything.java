package Day22.com;
import java.util.*;
public class ReplaceEverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next().toLowerCase().replaceAll("[0-9]","2").replaceAll("(a|e|i|o|u)","1").replaceAll("[a-z]","3");
		System.out.print(s1.replace("1","Vowels").replace("2","Digits").replace("3","Consonents"));
		s.close();

	}

}
