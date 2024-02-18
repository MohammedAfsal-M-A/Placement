package Day14.com;
import java.util.*;
public class StringDeletionEitherFrontOrBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int b=0,f=0,e=0;
		String s3="";
		boolean r=false;
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=0;j<s1.length()+1-i;j++)
            {
                String s2=s1.substring(j,j+i);
                StringBuffer p=new StringBuffer(s2);
                if(s2.equals(p.reverse().toString()))
                {
                    if(b<s2.length())
                    {
                    	b=s2.length();
                    	s3=s2;
                    	f=j;
                    	e=j+i;
                    	r=true;
                    }
                    
                }
            }
        }
        if(r)
        	System.out.println("The String Contains Palindrome with substring :"+s3+"\nStarts with index : "+f+"\nEnds with index : "+e);
        else
        	System.out.println("Does not contains plalindrome");
        s.close();
	}

}
