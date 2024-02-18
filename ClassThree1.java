package PlacementTraining;
import java.util.*;
public class ClassThree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double b=Math.floor(Math.log10(n))+1;
		System.out.print(((int)b==2?"The number is Two digit":"Not a Two digit"));
		s.close();

	}

}
