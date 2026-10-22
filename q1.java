package Tutorial1;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double num2 = input.nextDouble();

        double product = num1 * num2;
        System.out.println("Result = " + num1 + " x " + num2 + " = " + product);

    }
}
