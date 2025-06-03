import java.util.Scanner;

public class TransposisiMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        int[][] transpos = new int[3][3];

        // Input elemen matriks
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        // Transposisi matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpos[j][i] = matriks[i][j];
            }
        }

        // Tampilkan hasil transposisi
        System.out.println("\nMatriks Asli:");
        tampilkanMatriks(matriks);

        System.out.println("\nMatriks Hasil Transposisi:");
        tampilkanMatriks(transpos);

        scanner.close();
    }

    // Method untuk menampilkan matriks
    public static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
