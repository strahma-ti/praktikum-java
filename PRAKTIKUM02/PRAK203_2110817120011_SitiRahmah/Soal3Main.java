package PRAK203_2110817120011_SitiRahmah;

public class Soal3Main {
    public static void main(String[] args) {
    Pegawai p1 = new Pegawai();
    //Pada baris ini terjadi error karena kurang titik koma (;)
    //p1.nama = "Roi"
    p1.nama = "Roi";
    p1.asal = "Kingdom of Orvel";
    //Pada baris ini terjadi error karena deklarasi tidak sesuai dengan....
    //p1.jabatan = "Assasin";
    p1.setJabatan ("Assasin");
    //Kurang deklarasi pada property umur
    p1.umur = 17;
    
    //Pada baris ini output yang diperlukan adalah Nama: Roi, jadi kata pegawai dihapus
    //System.out.println("Nama Pegawai: " + p1.getNama());
    System.out.println("Nama: " + p1.getNama());
    System.out.println("Asal: " + p1.getAsal());
    System.out.println("Jabatan: " + p1.jabatan);
    //Pada baris ini kurang kata untuk mencetak kata tahun (+" tahun")
    //System.out.println("Umur: " + p1.umur);
    System.out.println("Umur: " + p1.umur + " tahun");
  }
}
