import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste que você deseja fazer: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a frase decifrada: ");
            String line = scanner.nextLine();

            String deciphered = unscrambleLine(line);
            System.out.println(deciphered);
        }

        scanner.close();
    }

    public static String unscrambleLine(String line) {
        StringBuilder deciphered = new StringBuilder();
        int half = line.length() / 2;

        for (int i = half - 1; i >= 0; i--) {
            deciphered.append(line.charAt(i));
        }

        for (int i = line.length() - 1; i >= half; i--) {
            deciphered.append(line.charAt(i));
        }

        return deciphered.toString();
    }
}
