package pertemuan5;

public class Stack_Sederhana {
    static String[] tumpukan;
    static int kapasitas;
    static int atas;

    // Inisialisasi ukuran stack
    void setUkuran(int ukuranBaru) {
        kapasitas = ukuranBaru;
        tumpukan = new String[kapasitas];
        atas = 0;
    }

    // Cek apakah stack kosong
    boolean isKosong() {
        return atas == 0;
    }

    // Cek apakah stack penuh
    boolean isPenuh() {
        return atas == kapasitas;
    }

    // Tambahkan data ke stack
    void push(String dataBaru) {
        if (isPenuh()) {
            System.out.println("Stack penuh. Tidak bisa menambahkan data: " + dataBaru);
        } else {
            tumpukan[atas] = dataBaru;
            System.out.println("Menambahkan \"" + dataBaru + "\" ke stack.");
            atas++;
        }
    }

    // Menampilkan data paling atas (peek)
    void lihatTeratas() {
        if (isKosong()) {
            System.out.println("Stack masih kosong.");
        } else {
            System.out.println("Data \"" + tumpukan[atas - 1] + "\" berada di atas stack.");
        }
    }

    // Mencari data dalam stack
    void cariData(String target) {
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < atas; i++) {
            if (tumpukan[i].equals(target)) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Data \"" + target + "\" ditemukan di posisi ke-" + (posisi + 1));
        } else {
            System.out.println("Data \"" + target + "\" tidak ditemukan dalam stack.");
        }
    }

    // Menampilkan seluruh isi stack
    void tampilkan() {
        System.out.println("\n=== Isi Stack Saat Ini ===");
        for (int i = atas - 1; i >= 0; i--) {
            System.out.println("[" + (i + 1) + "] " + tumpukan[i]);
        }
        System.out.println("==========================");
    }

    // Main program
    public static void main(String[] args) {
        Stack_Sederhana stack = new Stack_Sederhana();
        stack.setUkuran(6);
        stack.push("Piring");
        stack.push("Gelas");
        stack.push("Sendok");
        stack.push("Garpu");
        stack.push("Mangkok");
        stack.push("Lepek");

        stack.lihatTeratas();
        stack.tampilkan();
        stack.cariData("Mangkok");
        stack.cariData("Pisau");
    }
}

