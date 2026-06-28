//To calculate Fibonacci Series up to n numbers
import java.util.Scanner;
class Prog3
{
	public static void main(String[] args)
	{Scanner scn=new Scanner(System.in);
		System.out.println("ENTER NUM");
		int num=scn.nextInt();
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		display(n1,n2,n3,num);
		scn.close();
	}
	public static void display(int n1,int n2,int n3,int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
		
	}
}