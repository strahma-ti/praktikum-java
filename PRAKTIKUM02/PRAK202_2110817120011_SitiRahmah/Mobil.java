package PRAK202_2110817120011_SitiRahmah;
import java.text.DecimalFormat;

public class Mobil {
    String merek, tahun_keluaran, pemilik;
    int kapasitas, harga;
    
    DecimalFormat formatter = new DecimalFormat("#,###");
    
    String getPemilik(){
       return pemilik; 
    } 
    String getPajak(){
        double pajak = harga * 2/100;
        return formatter.format(Double.parseDouble(String.valueOf(pajak)));
    }
    void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + formatter.format(Double.parseDouble(String.valueOf(harga))));
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
    }
}
