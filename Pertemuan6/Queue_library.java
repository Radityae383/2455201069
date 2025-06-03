import java.util.LinkedList;
import java.util.Queue;

public class Queue_library {
    public static void main(String[] args) {
        // Membuat queue kosong bertipe String
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke antrian (enqueue)
        antrian.add("Andi");
        antrian.add("Budi");
        antrian.add("Citra");

        // Menampilkan isi antrian
        System.out.println("Isi antrian: " + antrian);

        // Melihat elemen paling depan (peek)
        System.out.println("Paling depan: " + antrian.peek());

        // Mengeluarkan elemen paling depan (dequeue)
        String keluar = antrian.poll();
        System.out.println("Keluar dari antrian: " + keluar);

        // Menampilkan isi antrian setelah satu keluar
        System.out.println("Isi antrian sekarang: " + antrian);

        // Mengecek apakah antrian kosong
        System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
    }
}

