package pertemuan5;

import java.util.Stack;

public class Stack_library {
    public static void main(String[] args) {
        // Membuat stack kosong bertipe String
        Stack<String> tumpukan = new Stack<>();

        // Menambahkan elemen ke dalam stack (push)
        tumpukan.push("Buku");
        tumpukan.push("Pensil");
        tumpukan.push("Penghapus");

        // Menampilkan isi stack
        System.out.println("Isi stack: " + tumpukan);

        // Melihat elemen paling atas tanpa menghapus (peek)
        System.out.println("Paling atas: " + tumpukan.peek());

        // Menghapus elemen paling atas (pop)
        String itemDikeluarkan = tumpukan.pop();
        System.out.println("Item dikeluarkan: " + itemDikeluarkan);

        // Menampilkan isi stack setelah pop
        System.out.println("Isi stack sekarang: " + tumpukan);

        // Mengecek apakah stack kosong
        System.out.println("Apakah stack kosong? " + tumpukan.isEmpty());
    }
}

