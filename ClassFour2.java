package PlacementTraining;
import java.util.*;
public class ClassFour2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double p=(n>800)?(100*0.5+300*1.5+500*2.5+(n-800)*5.0):(n>400)?(100*0.5+300*1.5+(n-400)*2.5):(n>100)?(100*0.5+(n-100)*1.5):n*0.5;
	    System.out.print(p);
	    s.close();

	}

}
