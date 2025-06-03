                                                 import java.util.HashMap;
import java.util.Map;

public class HitungKemunculan {
    public static void main(String[] args) {
        // Array input
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Map untuk menyimpan jumlah kemunculan setiap elemen
        Map<Integer, Integer> frekuensi = new HashMap<>();

        // Hitung frekuensi kemunculan
        for (int angka : array) {
            if (frekuensi.containsKey(angka)) {
                frekuensi.put(angka, frekuensi.get(angka) + 1);
            } else {
                frekuensi.put(angka, 1);
            }
        }

        // Tampilkan hasil
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println("Angka " + entry.getKey() + " muncul sebanyak " + entry.getValue() + " kali.");
        }
    }
}
