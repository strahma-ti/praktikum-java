package PRAKTIKUM01;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PRAK105_2110817120011_SITIRAHMAH {
    public static void main(String[] args){
        //--deklarasi variabel dan scanner
        Scanner keyboard = new Scanner(System.in);
        double r, t, phi, volume;
        
        //--deskripsi
        phi = 3.14;
        
        //--input
        System.out.print("Masukkan jari-jari: ");
        r = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi: ");
        t = keyboard.nextDouble();
        
        //--menghitung volume
        volume = phi * r * r * t;
        DecimalFormat df = new DecimalFormat("#.###");
        
        //-Output
        System.out.print("Volume tabung dengan jari-jari " + r +" cm dan ");
        System.out.print("tinggi " + t +" cm adalah " + df.format(volume) + " m3 ");
    }
    
}
