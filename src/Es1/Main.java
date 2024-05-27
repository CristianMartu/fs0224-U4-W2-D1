package Es1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = new Random().nextInt(1, 10);
        }
        System.out.println(Arrays.toString(arrayInt));

        Scanner scanner = new Scanner(System.in);
        int pos = 1;
        do {
            try {
                System.out.print("\n" + "Inserisci un numero da 1 a 5 \n"
                        + "per scegliere la posizione, o 0 per terminare: ");
                pos = scanner.nextInt();
                System.out.print("inserisci nuovo numero: ");
                int num = scanner.nextInt();
                if (pos < 0 | pos > 5) {
                    System.out.println("Index " + num + " out of bounds for length 5");
                } else {
                    arrayInt[pos] = num;
                    System.out.println(Arrays.toString(arrayInt));
                }
            } catch (InputMismatchException error) {
                System.out.println(error);
                scanner.next();
            }
        } while (pos != 0);
        scanner.close();
    }
}