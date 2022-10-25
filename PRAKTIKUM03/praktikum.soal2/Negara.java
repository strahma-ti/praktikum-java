package praktikum3.soal2;
import java.util.HashMap;
import java.util.Scanner;

public class Negara {
    private String nama;
    private String jenis;
    private String pemimpin;
    private int tanggal;
    private int bulan;
    private int tahun;
    
    public Negara(String NamaNegara, String JenisKepemimpinan, String NamaPemimpin, int TanggalMerdeka, int BulanMerdeka, int TahunMerdeka){
        nama = NamaNegara;
        jenis = JenisKepemimpinan;
        pemimpin = NamaPemimpin;
        tanggal = TanggalMerdeka;
        bulan = BulanMerdeka;
        tahun = TahunMerdeka;
    }
    
    public int getBulan(){
        return bulan;
    }
    
    void getData(){
        Scanner input = new Scanner(System.in);
        nama = input.nextLine();
        jenis = input.nextLine();
        pemimpin = input.nextLine();
        if (jenis.equalsIgnoreCase("presiden")||jenis.equalsIgnoreCase("perdana menteri")){
            tanggal = input.nextInt();
            bulan = input.nextInt();
            tahun = input.nextInt();
        }
    }   
    void display(){
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        
        System.out.println("");
        
        if (jenis.equalsIgnoreCase("presiden")){
        System.out.println("Negara "+nama+" mempunyai Presiden bernama " + pemimpin);
        }
        
        else if (jenis.equalsIgnoreCase("monarki")){
            System.out.println("Negara "+nama+" mempunyai Raja bernama " + pemimpin);
        }
        
        else if (jenis.equalsIgnoreCase("perdana menteri")){
            System.out.println("Negara "+nama+" mempunyai Perdana Menteri bernama " + pemimpin);
        }
        
        if (jenis.equalsIgnoreCase("Presiden")||jenis.equalsIgnoreCase("Perdana menteri")) {
        System.out.println("Deklarasi Kemerdekaan pada Tanggal "+tanggal+" "+month.get(getBulan())+" "+tahun);}
    }
}
