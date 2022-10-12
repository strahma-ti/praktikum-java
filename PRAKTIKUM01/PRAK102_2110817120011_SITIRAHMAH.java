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
public class PRAK102_2110817120011_SITIRAHMAH {
    public static void main(String[] args) {
        //--deklarasi variabel dan scanner
        Scanner keyboard = new Scanner(System.in);
        int angka, bilangan;
        
        //--input 
        System.out.print("Input bilangan: ");
        angka = keyboard.nextInt();
        
        //--proses
        int i = 0;
        while(i < 7 ) {
            if (angka %2 == 0){
                bilangan = (angka /2 )-1;
            } else {
                bilangan=angka;
            }
        
        //--output
        if(i == 7){
            System.out.print(bilangan);
        }else {
            System.out.print(bilangan);
        } 
        
        if(i < 6){
            System.out.print(", ");
        } else {
            System.out.println("");
        }
        
        angka++;
        i++;
            } 
}
}
