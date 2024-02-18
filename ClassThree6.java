package PlacementTraining;
import java.util.*;
public class ClassThree6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		s1=s1.toUpperCase();
		char ch=s1.charAt(s1.length()-1);
		System.out.print((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"yes":"No");
		s.close();

	}

}