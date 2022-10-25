package praktikum3.soal2;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args){
        String nama = "", jenis="", pemimpin="";
        int tanggal=0, bulan=0, tahun=0;
        Scanner input = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun);
        LinkedList<Negara> llNegara = new LinkedList<Negara>();

        int ulang;
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            Negara c = new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun);
            c.getData();
            llNegara.add(c);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.display();
        }
    }
}
