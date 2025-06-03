import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queuestudikasus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> antrian = new LinkedList<>();
        int pilihan;

        do {
            System.out.println("\n--- Menu Antrian Bank ---");
            System.out.println("1. Tambah Nasabah ke Antrian");
            System.out.println("2. Layani Nasabah");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama nasabah: ");
                    String nama = scanner.nextLine();
                    antrian.add(nama);
                    System.out.println(nama + " telah ditambahkan ke antrian.");
                    break;

                case 2:
                    if (!antrian.isEmpty()) {
                        String dilayani = antrian.poll();
                        System.out.println("Sedang melayani: " + dilayani);
                    } else {
                        System.out.println("Tidak ada nasabah dalam antrian.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Daftar Antrian ---");
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        for (String nasabah : antrian) {
                            System.out.println(nasabah);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}



