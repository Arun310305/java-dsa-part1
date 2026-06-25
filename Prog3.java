//Input a year and find whether it is a leap year or not.
import java.util.Scanner;
class Prog3
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER YEAR : ");
        int year=scn.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("THIS IS A LEAP YEAR");
        }
        else
        {
            System.out.println("THIS IS NOT A LEAP YEAR");
        }
           scn.close();
    }
}