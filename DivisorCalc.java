import java.util.Scanner;

public class DivisorCalc {
    public static void main (String[]arg){

        double num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.print("number 1: ");
        num1 = scan.nextDouble();

        System.out.print("number 2: ");
        num2 = scan.nextDouble();

        System.out.println ("Greatest common divisor is " + gcd(num1,num2));
    }

    public static double gcd(double num1, double num2)

    {
        if (num1 % num2==0)
            return num2;

        else
            return gcd ( num2, num1 % num2);
    }
}
