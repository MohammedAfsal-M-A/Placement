package PlacementTraining;
import java.util.*;

public class ClassFour1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt(),m=(n1+n+n2)/3;
		System.out.print((m>=91&&m<=100)?"O":(m>=81&&m<=90)?"A":(m>=71&&m<=80)?"B":(m>=61&&m<=70)?"C":(m>=51&&m<=60)?"D":"F");
		s.close();
	}

}
