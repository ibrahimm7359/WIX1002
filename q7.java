import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in inches: ");
        double inches = input.nextDouble();

        double meters = inches * 2.54 / 100;

        System.out.printf("The length in meters is %.2f%n", meters);

    }
}