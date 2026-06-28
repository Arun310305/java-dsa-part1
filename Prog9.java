//To find Armstrong Number between two given number.
import java.util.Scanner;
class Prog9
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER START");
		int start=scn.nextInt();
		System.out.println("ENTER END");
		int end=scn.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int num =i;
			int sum=0;
			int dis=String.valueOf(i).length();
			
		
		while(num>0)
		{
			int rem=num%10;
			sum+=(int)Math.pow(rem,dis);
			num=num/10;
		}
		if(sum==i)
		{
			System.out.println(i);
		}
		}
		scn.close();
	}
}