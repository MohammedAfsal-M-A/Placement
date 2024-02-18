package PlacementTraining;
import java.util.*;
public class ClassTwo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.print((n%10<n1%10&&n%10<n2%10)?n:(n1%10<n%10&&n1%10<n2%10)?n1:n2);
		s.close();

	}

}
