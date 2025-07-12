public class Bubbleshorting {

    public static void main(String[] args) {
        int[] dataAngka = {5, 3, 8, 4, 2};

        urutkanDenganBubble(dataAngka);

        System.out.print("Hasil pengurutan: ");
        for (int nilai : dataAngka) {
            System.out.print(nilai + " ");
        }
    }

    // Metode untuk melakukan pengurutan bubble sort
    public static void urutkanDenganBubble(int[] data) {
        boolean sudahTerurut;

        for (int tahap = 0; tahap < data.length - 1; tahap++) {
            sudahTerurut = true;

            for (int i = 0; i < data.length - tahap - 1; i++) {
                if (data[i] > data[i + 1]) {
                    // Tukar elemen jika urutannya salah
                    int sementara = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = sementara;
                    sudahTerurut = false;
                }
            }

            // Jika tidak ada pertukaran dalam satu iterasi, berarti array sudah urut
            if (sudahTerurut) {
                break;
            }
        }
    }
}

