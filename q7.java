package Tutorial1;

import java.util.Random;

public class q7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int odd = 0, even = 0;

        System.out.print("Numbers: ");
        for (int counter = 0; counter < 10; counter++) {
            int num = 10 + rand.nextInt(91); 
            System.out.print(" " + num);
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println();
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }
}
