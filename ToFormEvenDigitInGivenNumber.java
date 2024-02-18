package Day21.com;

import java.util.Scanner;

public class ToFormEvenDigitInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		while(n>0)
		{
			int r=n%10;
			if(r%2==0)
			{
				sum+=(sum*10)+r;
			}
			n/=10;
		}
		System.out.print(sum);
		s.close();

	}

}
