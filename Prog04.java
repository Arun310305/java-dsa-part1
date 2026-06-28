//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;
class Prog4
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER NUM!:");
        int num1=scn.nextInt();
        System.out.println("ENTER NUM2:");
        int num2=scn.nextInt();
        int hfc= 0;
        for(int i=1;i<=num1&&i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hfc=i;
            }
        }
        System.out.println("HCF: " + hfc);
        int lcm=num1*num2/hfc;
        System.out.println("LCM: " + lcm);
        scn.close();
    }

}