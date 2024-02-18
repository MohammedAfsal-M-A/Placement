package Day19.com;
import java.util.*;
public class ReplaceAllOccuranceOfIsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			s2[i]=s2[i].replaceFirst("(is|IS)","");
			System.out.print(s2[i]+" ");
		}
		s.close();

	}

}
