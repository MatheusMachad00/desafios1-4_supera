import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a ser digitada: ");
        int arrayLength = scanner.nextInt();

        int[] items = new int[arrayLength];

        for (int i = 0; i < items.length; i++) {

            System.out.println("Digite o " + (i + 1) + " valor inteiro: ");
            items[i] = scanner.nextInt();

        }

        List<Integer> odds = new ArrayList<Integer>();
        List<Integer> evens = new ArrayList<Integer>();

        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                evens.add(items[i]);
            } else {
                odds.add(items[i]);
            }
        }

        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());
        System.out.println("");
        evens.forEach(System.out::println);
        odds.forEach(System.out::println);

        scanner.close();
    }
}
