package PRAK203_2110817120011_SitiRahmah;

//Pada baris ini terjadi error karena nama public class tidak sesuai dengan nama file .java
//public class Employee {
public class Pegawai {
    public String nama;
    //Pada baris ini, property asal tidak menggunakan tipe data char
    //tetapi menggunakan tipe data String karena menyimpan berbagai karakter huruf (kata)
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    
    //Pada baris ini terjadi error jika tipe data pada property "asal" tidak diubah
    //jadi untuk menjalankan baris ini, property "asal" harus diubah tipe datanya menjadi String
    public String getAsal() {
        return asal;
    }
    
    //Pada baris ini terjadi error dikarenkan tidak ada syntax yang mendeklarasikan variabel j.
    //Sehingga variabel j harus dideklarasikan terlebih dahulu
    //public void setJabatan() {
    public void setJabatan(String j) {
       this.jabatan = j;
    }
}