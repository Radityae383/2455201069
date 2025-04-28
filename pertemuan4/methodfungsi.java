public class methodfungsi {
    public static void main(String[] args) {
        methodfungsi kalkulasiNilai = new methodfungsi();
        double rataRataNilai = kalkulasiNilai.hitungRataRata();
        System.out.println("Rata-rata Nilai dari fungsi = " + rataRataNilai);
    }
    
    // Fungsi untuk menghitung nilai rata-rata
    public double hitungRataRata(){   
        int ips = 100;
        int kalkulus = 95;
        int sejarah = 98;
        
        int[] nilaiArray = {ips, kalkulus, sejarah};
        double totalNilai = 0;
        double rataRata;
        for(int i = 0; i < nilaiArray.length; i++){
            totalNilai += nilaiArray[i];
        }
        rataRata = totalNilai / nilaiArray.length;
        return rataRata;
    }
}