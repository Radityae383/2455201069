import java.util.Scanner;

public class percabanganswitchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

// SWITCH CASE
        System.out.print("Masukkan angka (1-3): ");
        int angka = input.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            default:
                System.out.println("Tidak dikenali");
        }

        input.close();
    }
}
