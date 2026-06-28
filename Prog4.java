//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class Prog4 {
	public static void main(String[] args)
	{
	Scanner scn=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s1=scn.next();
		String rev="";
		char ch=' ';
		for(int i=s1.length()-1;i>=0;i--)
		{
			ch =s1.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
		if(rev.equals(s1))
		{
			System.out.println("IT IS PALINDROM");
		}
		else
		{
			System.out.println("IT IS NOT PALINDROM");
		
		}
		scn.close();
	}
}