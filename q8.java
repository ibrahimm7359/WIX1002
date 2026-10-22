package Tutorial1;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toUpperCase();

        int countU = 0, countM = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'U') {
                countU++;            
            } else if (ch == 'M') {
                countM++;
            }
        }
        
        System.out.println("Number of U's: " + countU);
        System.out.println("Number of M's: " + countM);
}
}