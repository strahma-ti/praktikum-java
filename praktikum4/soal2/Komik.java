package praktikum4.soal2;

public class Komik extends Buku{
    private final int volume;
    private final String sinopsis;
    
    public Komik(String j, String p, String t, int v, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }
    public String getKomikDetail(){
        return "Data yang baru diinputkan adalah\nSebuah Komik dengan judul \"" + judul
                    + "\".\nKomik  tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun
                    + ". \nSampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah."
                    + "\nSinopsis: " + sinopsis.substring(0, 64) + "...";
    }    
}