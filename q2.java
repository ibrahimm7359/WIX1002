package Tutorial1;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(101);

        if (num > 50) {
            Sytem.out.println(num + " is greater than 50");
        } else if (num < 50) {
            System.out.println(num + " is not greater than 50");
        }
    }   
}
