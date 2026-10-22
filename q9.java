package Tutorial1;

import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a keyword: ");
        String keyword = keyboard.nextLine().trim();
        
        int freq = 0;
        try {
            Scanner page = new Scanner(URI.create("https://www.um.edu.my/").toURL().openStream());

            page.useDelimiter("[^A-Za-z0-9]+");
            while (page.hasNext()) {
                if (page.next().equalsIgnoreCase(keyword)) {
                    freq++;
                }
            }
            page.close();

        } catch (IOException e) {
            System.out.println("Could not read the web page: " + e.getMessage());
            return;

        }
        System.out.println("\"" + keyword + "\" appears " + freq + " time(s)");
        
    }
}