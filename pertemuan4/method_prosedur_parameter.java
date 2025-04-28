public class method_prosedur_parameter {
    public static void main(String[] args) {
        method_prosedur_parameter dataMahasiswa = new method_prosedur_parameter();
        dataMahasiswa.tampilkanNilai("Tino", 90, 87, 100);
        dataMahasiswa.tampilkanNilai("Fiko", 89, 95, 100);
        dataMahasiswa.tampilkanNilai("Denny", 96, 75, 100);
    }

    public void tampilkanNilai(String nama, int nilaiIPS, int nilaiKalkulus, int nilaiPemrograman) {
        String[] namaMatkul = {"IPS", "Kalkulus", "Pemrograman"};
        int[] nilaiMahasiswa = {nilaiIPS, nilaiKalkulus, nilaiPemrograman};

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println("Nilai " + namaMatkul[i] + " " + nama + ": " + nilaiMahasiswa[i]);
        }
        System.out.println(); // tambahan enter setelah tiap mahasiswa
    }
}