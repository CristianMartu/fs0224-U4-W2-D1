package Es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

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
                logger.info("Inserisci un numero da 1 a 5 \n"
                        + "per scegliere la posizione, o 0 per terminare: ");
                pos = scanner.nextInt();
                logger.info("inserisci nuovo numero: ");
                int num = scanner.nextInt();
                if (pos < 0 | pos > 5) {
                    logger.info("Index " + num + " out of bounds for length 5");

                } else {
                    arrayInt[pos] = num;
                    logger.info(Arrays.toString(arrayInt));
                }
            } catch (InputMismatchException error) {
                logger.error(String.valueOf(error));
                scanner.next();
            }
        } while (pos != 0);
        scanner.close();
    }
}