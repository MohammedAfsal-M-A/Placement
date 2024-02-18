package PlacementTraining;
import java.util.*;
public class ClassTwo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double p=Math.floor(Math.log10(n));
		double l=Math.pow(10, p);
		int r=(int)l;
		System.out.print((n/r)+n%10);
		s.close();

	}

}
