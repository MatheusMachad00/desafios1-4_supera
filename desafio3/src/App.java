import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array (n): ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor alvo (k): ");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);

        scanner.close();
    }

    public static int countPairsWithDifference(int[] arr, int k) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            count += numCounts.getOrDefault(num - k, 0);
            count += numCounts.getOrDefault(num + k, 0);
            numCounts.merge(num, 1, Integer::sum);
        }

        return count;
    }
}
