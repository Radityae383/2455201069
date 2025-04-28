public class methodfungsiparameter {
    public static void main(String[] args) {
        methodfungsiparameter nilaiMahasiswa = new methodfungsiparameter();
        nilaiMahasiswa.tampilkanNilai("Rizki", 90, 78, 100);
        nilaiMahasiswa.tampilkanNilai("Kevin", 80, 40, 100); 
        
        methodfungsiparameter kalkulator = new methodfungsiparameter();
        double rataRataHuseen = kalkulator.hitungRataRata("Rzki", 90, 78, 100);
        System.out.println("Rata-rata Nilai Rizki: " + rataRataHuseen + "\n");
        
        double rataRataBayu = kalkulator.hitungRataRata("Kevin", 80, 40, 100);
        System.out.println("Rata-rata Nilai Kevin: " + rataRataBayu + "\n");
    }
    
    public void tampilkanNilai(String nama, int ipa, int mtk, int strukturData){
        int[] nilaiMahasiswa = {ipa, mtk, strukturData};
        String[] matkul = {"IPA", "MTK", "Struktur Data"};
        for(int i = 0; i < matkul.length; i++){
            System.out.println("Nilai " + matkul[i] + " " + nama + " : " + nilaiMahasiswa[i]);
        }
        System.out.println("\n");
    }
    
    public double hitungRataRata(String nama, int ipa, int mtk, int strukturData){
        int[] nilaiMahasiswa = {ipa, mtk, strukturData};
        double totalNilai = 0;
        double rataRata;
        for(int i = 0; i < nilaiMahasiswa.length; i++){
            totalNilai += nilaiMahasiswa[i];
        }
        rataRata = totalNilai / nilaiMahasiswa.length;
        System.out.println("Nama: " + nama);
        return rataRata;
    }
}