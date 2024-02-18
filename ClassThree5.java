package PlacementTraining;
import java.util.*;
public class ClassThree5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		System.out.print((s1.length()%2==0)?s1.charAt(s1.length()-1):s1.charAt(s1.length()/2));
		s.close();

	}

}
