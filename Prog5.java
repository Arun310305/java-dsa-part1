//Take in two numbers and an operator (+, -, *, /) and calculate the value.
import java.util.Scanner;
class Prog5
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println("ENTER NUM1");
		int num1=scn.nextInt();
		System.out.println("ENTER NUM2");
		int num2=scn.nextInt();
		System.out.println("1.add\n2.sub\n3.mul\n4.div");
		System.out.println("ENTER OPTION");
		int opt=scn.nextInt();
		display(num1,num2,opt);
		scn.close();
	}
	public static void display(int num1,int num2,int opt)
	{
		switch(opt)
		{
			case 1:
			
				int a=num1+num2;
				System.out.println(a);
			      break;
			case 2:
			
				int b=num1-num2;
				System.out.println(b);
			break;
			case 3:
			
				int c=num1*num2;
				System.out.println(c);
			break;
			case 4:
			
				int d=num1/num2;
				System.out.println(d);
			break;
			default:
			
				System.out.println("NO INPUTS");
			
			
		}
	}
}