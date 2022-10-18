package PRAK201_2110817120011_SitiRahmah;

public class Mangga {
    // Atribut dan Tipe Data
    String nama, warna, tekstur, rasa;
    double berat, total_berat;
    int harga, total_harga, jumlah_beli;

public Mangga(String NamaMangga, String WarnaMangga, String TeksturMangga, String RasaMangga, double BeratMangga, int JumlahBeliMangga, double TotalBeratMangga, int HargaMangga, int TotalHargaMangga){
    nama = NamaMangga;
    warna = WarnaMangga;
    tekstur = TeksturMangga;
    rasa = RasaMangga;
    berat = BeratMangga;
    harga = HargaMangga;
    jumlah_beli = JumlahBeliMangga;
    total_berat = BeratMangga * JumlahBeliMangga;
    total_harga = HargaMangga * JumlahBeliMangga;
    }

public void display(){
        System.out.println("Nama Mangga: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jumlah Beli: " + jumlah_beli);
        System.out.println("Total berat: " + total_berat + " kg");
        System.out.println("Total harga: Rp. " + total_harga);
        System.out.println();
    }
}

