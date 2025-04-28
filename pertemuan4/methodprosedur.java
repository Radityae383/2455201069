public class methodprosedur {
    public static void main(String[] args) {
        methodprosedur nilaiMahasiswa = new methodprosedur();
        nilaiMahasiswa.hitungRataRata();
    }
    
    // Metode untuk menghitung nilai rata-rata
    public void hitungRataRata (){
        int nilaiIPS = 69;
        int nilaiKalkulus = 90;
        int nilaiPemrograman = 80;
        
        int[] nilaiArray = {nilaiIPS, nilaiKalkulus, nilaiPemrograman};
        double total = 0;
        double rataRata;
        for(int i = 0; i < nilaiArray.length; i++){
            total += nilaiArray[i];
        }
        rataRata = total / nilaiArray.length;
        System.out.println("Hasil Rata-rata Nilai = " + rataRata);
    }
}
