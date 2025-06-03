public class SortingNama {

    public static void main(String[] args) {
        String[] nama = {"Rina", "Andi", "Budi", "Santi", "Dodi", "Eka", "Citra"};

        System.out.println("Array Asli:");
        tampilkan(nama);

        // Insertion Sort
        String[] insertionSorted = nama.clone();
        insertionSort(insertionSorted);
        System.out.println("\nHasil Insertion Sort:");
        tampilkan(insertionSorted);

        // Selection Sort
        String[] selectionSorted = nama.clone();
        selectionSort(selectionSorted);
        System.out.println("\nHasil Selection Sort:");
        tampilkan(selectionSorted);

        // Bubble Sort
        String[] bubbleSorted = nama.clone();
        bubbleSort(bubbleSorted);
        System.out.println("\nHasil Bubble Sort:");
        tampilkan(bubbleSorted);
    }

    // Metode untuk Insertion Sort
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Metode untuk Selection Sort
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indeksMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareToIgnoreCase(arr[indeksMin]) < 0) {
                    indeksMin = j;
                }
            }

            // Tukar
            String temp = arr[indeksMin];
            arr[indeksMin] = arr[i];
            arr[i] = temp;
        }
    }

    // Metode untuk Bubble Sort
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean tukar;
        for (int i = 0; i < n - 1; i++) {
            tukar = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    // Tukar
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    tukar = true;
                }
            }
            if (!tukar) break; // sudah urut
        }
    }

    // Metode untuk menampilkan array
    public static void tampilkan(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
