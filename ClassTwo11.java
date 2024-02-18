package PlacementTraining;
import java.util.*;

public class ClassTwo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String p=Integer.toBinaryString(n);
		System.out.print((p.charAt(p.length()-1)=='1')?"Odd":"Even");
		s.close();

	}

}
