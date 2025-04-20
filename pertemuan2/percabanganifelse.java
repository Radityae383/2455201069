import java.util.Scanner;

public class percabanganifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // IF ELSE
        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else if (nilai >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        }
    }

}
