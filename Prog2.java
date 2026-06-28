//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
class Prog2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER NUM1");
		int num1=scn.nextInt();
		System.out.println("ENTER NUM2");
		int num2=scn.nextInt();
		display(num1,num2);
		scn.close();
	}
	public static void display(int num1,int num2)
	{
		if(num1>num2)
		{
			System.out.println("NUM1 IS LARGEST THEN NUM2");
		}
		else
		{
			System.out.println("NUM2 IS LARGEST THEN NUM1");
		
		}
	}
}