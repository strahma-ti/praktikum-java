package praktikum4.soal1;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String j, p;
        int t;
        
        System.out.print("Judul: ");
        j = input.nextLine();
        
        System.out.print("Penulis: ");
        p = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        t = input.nextInt();
        
        Buku buku;
        buku = new Buku(j,p,t);
        buku.display();
    }
}