import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //a.
        double amount = 32.5;
        amount += 10;
        System.out.println("The amount is " + amount);

        //b. 
        String chapter = "Summary";
        System.out.println(chapter);

        //c.
        int num = 0;
        num++;
        int num1 = num;

        //d.
        int numm = 3000;
        System.out.printf("%d%n", numm);

        //e.
        Scanner keyboard = new Scanner(System.in);
        String contact = keyboard.nextLine();

        System.out.println("Contact: " + contact);
    }
}
