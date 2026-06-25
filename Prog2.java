//Take a number as input and print the multiplication table for it.
import java.util.Scanner;
class Prog2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER WHICH TABLE YOU WANT : ");
		int n=scn.nextInt();
		System.out.println("ENTER END");
		int end=scn.nextInt();
		for(int i=1;i<=end;i++)
		{
			System.out.println(i+"*"+n+" = "+i*n);               
		}
		scn.close();
	}
}