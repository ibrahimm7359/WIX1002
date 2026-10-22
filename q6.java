import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the diameter: ");
        double diameter = input.nextDouble();

        double circumference = Math.PI * diameter;

        System.out.printf("The circumference is %.3f%n", circumference);
    }
    
}
