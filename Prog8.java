//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

class Prog8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scn.nextLine();

        System.out.println("Hello " + name + "! Welcome!");
        scn.close();
    }
}