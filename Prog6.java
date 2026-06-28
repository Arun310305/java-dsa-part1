//Input currency in rupees and output in USD.
import java.util.Scanner;
class Prog6
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER RUPEES");
		int num1=scn.nextInt();
		double USD=num1/90.20;
		System.out.println("USD :"+USD);
		scn.close();
	}
}
	