package praktikum4.soal1;

public class Buku {
    // field
    private final String judul, penulis;
    private final Integer tahun;
    
    //konstruktor
    public Buku(String j, String p, int t){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }
        public void display(){
        System.out.println();
        System.out.println("Detail buku: ");
        System.out.println("Judul adalah " + this.judul);
        System.out.println("Penulis adalah " + this.penulis);
        System.out.println("Tahun Terbit adalah " + this.tahun);
    }
}
    

