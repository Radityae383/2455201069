    class HapusDuplikat {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Proses penghapusan duplikat
        int n = array.length;
        int[] temp = new int[n];
        int ukuranUnik = 0;

        for (int i = 0; i < n; i++) {
            boolean sudahAda = false;
            for (int j = 0; j < ukuranUnik; j++) {
                if (array[i] == temp[j]) {
                    sudahAda = true;
                    break;
                }
            }
            if (!sudahAda) {
                temp[ukuranUnik++] = array[i];
            }
        }

        // Cetak array tanpa duplikat
        System.out.print("Array tanpa duplikat: [");
        for (int i = 0; i < ukuranUnik; i++) {
            System.out.print(temp[i]);
            if (i != ukuranUnik - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
