package PlacementTraining;
import java.util.*;
public class ClassTwo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print((n%4==0)?((n%100==0)?((n%400==0)?"Yes Leap Year":"Not A Leap Year"):"Yes Leap Year"):"Not A Leap Year");
		s.close();
	}

}
