package Tutorial1;

import java.util.Random;

public class q10 {
    public static void main(String[] args) {
        Random rand = new Random();
        char[] gender = new char[100];

        for (int i = 0; i < gender.length; i++) {
            gender[i] = rand.nextBoolean() ? 'F' : 'M';

        }
        int female = 0;
        for (char g : gender) {
            if (g == 'F') {
                female++;
            }
        }
        System.out.println("Number of female students: " + female + " out of 100");
        
    }
}
