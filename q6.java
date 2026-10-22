package Tutorial1;

import java.util.Random;

public class q6 {
    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(101);
        System.out.println("Numbers: " + num);
        int min = num;

        for (int counter = 1; counter < 10; counter++) {
            num = rand.nextInt(101); 
            System.out.print(" " + num);
            if (num < min) {
                min = num;
            }
        }

        System.out.println();
        System.out.println("Minimum: " + min);


    }
}
