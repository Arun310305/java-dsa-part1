//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
class Prog7
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER PRINCIPAL AMOUNT");
		int p=scn.nextInt();
		System.out.println("ENTER YEAR");
		int t=scn.nextInt();
		System.out.println("ENTER RATE OF INTEREST");
		int r=scn.nextInt();
		int SI=p*t*r/100;
		System.out.println("SIMPLE INTEREST AMOUNT :"+SI);
		scn.close();
	}
}