import java.util.Scanner;

public class CekMatriksIdentitas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        // Input elemen-elemen matriks
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }                                                                                                
        }

        // Cek apakah matriks adalah matriks identitas
        boolean identitas = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriks[i][j] != 1) {
                    identitas = false;
                    break;
                } else if (i != j && matriks[i][j] != 0) {
                    identitas = false;
                    break;
                }
            }
            if (!identitas) break;
        }

        // Output hasil
        if (identitas) {
            System.out.println("Matriks tersebut adalah matriks identitas.");
        } else {
            System.out.println("Matriks tersebut BUKAN matriks identitas.");
        }

        scanner.close();
    }
}
