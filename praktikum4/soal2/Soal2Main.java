package praktikum4.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan Pilihan : ");
        int pil = inp.nextInt();
        inp.nextLine();

        switch (pil) {
            case 1 ->                 {
                    String judul, penulis, tahun, genre, sinopsis;
                    System.out.print("Judul: ");
                    judul = inp.nextLine();
                    System.out.print("Penulis: ");
                    penulis = inp.nextLine();
                    System.out.print("Tahun Terbit: ");
                    tahun = inp.nextLine();
                    System.out.print("Genre: ");
                    genre = inp.nextLine();
                    System.out.print("Sinopsis: ");
                    sinopsis = inp.nextLine();
                    Novel nvl = new Novel(judul, penulis, tahun, genre, sinopsis);
                    System.out.println(nvl.getNovelDetail());
                }
            case 2 ->                 {
                    String judul, penulis, tahun, sinopsis;
                    int volume;
                    System.out.print("Judul: ");
                    judul = inp.nextLine();
                    System.out.print("Penulis: ");
                    penulis = inp.nextLine();
                    System.out.print("Tahun Terbit: ");
                    tahun = inp.nextLine();
                    System.out.print("Volume: ");
                    volume = inp.nextInt();
                    inp.nextLine();
                    System.out.print("Sinopsis: ");
                    sinopsis = inp.nextLine();
                    Komik kmk = new Komik(judul, penulis, tahun, volume, sinopsis);
                    System.out.println(kmk.getKomikDetail());
                }
            default -> System.out.println("Tidak ada di daftar pilihan");
        }
    }  
}
