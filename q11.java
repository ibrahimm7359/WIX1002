package Tutorial1;

import java.util.Random;

public class q11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(101);

        }
        System.out.print("Before: ");
        print(list);

        for (int pass = 1; pass < list.length; pass++) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] < list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        System.out.print("After: ");
        print(list);

    }
    static void print(int[] list) {
        for (int x : list) {
            System.out.print(x + " ");

        }
        System.out.println();
    }
}
