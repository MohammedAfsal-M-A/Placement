package PlacementTraining;
import java.util.*;
public class ClassTwo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.print((n>n1&&n>n2)?n:(n1>n&&n1>n2)?n1:n2);
		s.close();
		}

	}


