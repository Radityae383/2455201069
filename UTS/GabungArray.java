public class GabungArray {
    public static void main(String[] args) {
        // Dua array yang akan digabungkan
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Hitung panjang total array hasil
        int panjangGabungan = array1.length + array2.length;
        int[] gabungan = new int[panjangGabungan];

        // Salin elemen dari array1 ke array gabungan
        for (int i = 0; i < array1.length; i++) {
            gabungan[i] = array1[i];
        }

        // Salin elemen dari array2 ke array gabungan
        for (int i = 0; i < array2.length; i++) {
            gabungan[array1.length + i] = array2[i];
        }

        // Cetak hasil array gabungan
        System.out.print("Array gabungan: [");
        for (int i = 0; i < gabungan.length; i++) {
            System.out.print(gabungan[i]);
            if (i != gabungan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
