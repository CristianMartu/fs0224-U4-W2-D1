package Es2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Inserire i km percorsi: ");
            int km = scanner.nextInt();
            System.out.print("inserire carburante consumato: ");
            int l = scanner.nextInt();
            System.out.println(km / l);
        } catch (InputMismatchException | ArithmeticException error) {
            System.out.println(error);
        }
    }
}
