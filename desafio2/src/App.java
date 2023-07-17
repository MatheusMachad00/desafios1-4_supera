import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor monetário (formato: 12.00): ");
        double value = scanner.nextDouble();

        int cents = (int) Math.round(value * 100);

        int[] notesAndCoins = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
        String[] values = { "R$ 100.00", "R$ 50.00", "R$ 20.00", "R$ 10.00", "R$ 5.00", "R$ 2.00",
                "R$ 1.00", "R$ 0.50", "R$ 0.25", "R$ 0.10", "R$ 0.05", "R$ 0.01" };

        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            int amount = cents / notesAndCoins[i];
            cents %= notesAndCoins[i];
            System.out.println(amount + " nota(s) de " + values[i]);
        }

        System.out.println("MOEDAS:");
        for (int i = 6; i < notesAndCoins.length; i++) {
            int amount = cents / notesAndCoins[i];
            cents %= notesAndCoins[i];
            System.out.println(amount + " moeda(s) de " + values[i]);
        }

        scanner.close();
    }
}
