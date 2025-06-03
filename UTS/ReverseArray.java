import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input elemen-elemen array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Cetak array secara terbalik
        System.out.print("Array terbalik: [");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}
