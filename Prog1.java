//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
class Prog1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER NUM1");
		int num1=scn.nextInt();
		display(num1);
		scn.close();
	}
	public static void display(int num1)
	{
		if(num1%2==0)
		{
			System.out.println("IT IS EVEN NUMBER");
		}
		else
		{
			System.out.println("IT IS ODD NUMBER");
		
		}
	}
}