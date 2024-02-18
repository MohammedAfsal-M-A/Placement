package Day19.com;
import java.util.*;
public class SecondSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		secondSmallWord(s2);
		s.close();

	}
	public static void secondSmallWord(String[] s2) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<s2.length;i++)
		{
			if(!al.contains(s2[i].length()))
			al.add(s2[i].length());
		}
		Collections.sort(al);
		for(int i=0;i<s2.length;i++)
		{
			if(al.get(1)==s2[i].length())
			{
				System.out.print(s2[i]+" ");
			}
		}
		
	}

}
