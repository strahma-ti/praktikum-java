package PRAKTIKUM01;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS
 */
public class PRAK103_2110817120011_SITIRAHMAH {
        public static void main(String[] args) {
            
        //--deklarasi variabel dan scanner
        Scanner keyboard = new Scanner (System.in);
        int angka;
        
        //--input
        System.out.print("Masukkan input: ");
        angka = keyboard.nextInt();
        

        //--proses dan output
        int i = 0;
        do {
            if (angka % 7 != 0) {
            if (i == 5) {
                System.out.print(angka);
            } else { 
                System.out.print(angka);
                }
            }
            
            if(i < 4){
            System.out.print(", ");
        } 
            angka--;
            i++;
            
        } while (i < 5);
        System.out.println();
    }
}

