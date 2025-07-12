public class insertionshorting {
    public static void main(String[] args) {
        int[] data = {22, 11, 99, 88, 9, 7, 42};

        insertionSisip(data); // panggil metode pengurutan

        System.out.print("Data setelah diurutkan: ");
        for (int angka : data) {
            System.out.print(angka + " ");
        }
    }

    // Metode untuk melakukan insertion sort
    public static void insertionSisip(int[] array) {
        for (int indeksSaatIni = 1; indeksSaatIni < array.length; indeksSaatIni++) {
            int nilaiYangDisisipkan = array[indeksSaatIni];
            int posisiSebelumnya = indeksSaatIni - 1;

            // Pindahkan elemen yang lebih besar dari nilaiYangDisisipkan ke posisi berikutnya
            while (posisiSebelumnya >= 0 && array[posisiSebelumnya] > nilaiYangDisisipkan) {
                array[posisiSebelumnya + 1] = array[posisiSebelumnya];
                posisiSebelumnya--;
            }

            // Tempatkan nilai yang disisipkan pada posisi yang tepat
            array[posisiSebelumnya + 1] = nilaiYangDisisipkan;
        }
    }
}

