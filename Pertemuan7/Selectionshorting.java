public class SelectionShorting {
    public static void main(String[] args) {
        int[] dataAngka = {29, 10, 14, 37, 13};

        urutkanDenganSeleksi(dataAngka); // Panggil metode pengurutan

        System.out.print("Data setelah diurutkan: ");
        for (int angka : dataAngka) {
            System.out.print(angka + " ");
        }
    }

    // Metode untuk mengurutkan array dengan selection sort
    public static void urutkanDenganSeleksi(int[] data) {
        int panjang = data.length;

        for (int langkah = 0; langkah < panjang - 1; langkah++) {
            int posisiTerkecil = langkah;

            // Cari posisi elemen terkecil dari sisa array
            for (int indeks = langkah + 1; indeks < panjang; indeks++) {
                if (data[indeks] < data[posisiTerkecil]) {
                    posisiTerkecil = indeks;
                }
            }

            // Tukar elemen jika ditemukan elemen yang lebih kecil
            if (posisiTerkecil != langkah) {
                int sementara = data[langkah];
                data[langkah] = data[posisiTerkecil];
                data[posisiTerkecil] = sementara;
            }
        }
    }
}

