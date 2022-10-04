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
public class PRAK104_2110817120011_SITIRAHMAH {
    public static void main(String[] args){
        
        //--deklarasi variabel dan scanner
        Scanner keyboard = new Scanner(System.in);
        
        int Andi, AndiR1, AndiR2, AndiR3;
        int Budi, BudiR1, BudiR2, BudiR3;
        
        
        //--input
        System.out.print("Kartu Andi: ");
        AndiR1 = keyboard.nextInt();
        AndiR2 = keyboard.nextInt();
        AndiR3 = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Kartu Budi: ");
        BudiR1 = keyboard.nextInt();
        BudiR2 = keyboard.nextInt();
        BudiR3 = keyboard.nextInt();
        
        //--proses akumulasi
        Andi = AndiR1 + AndiR2 + AndiR3;
        Budi = BudiR1 + BudiR2 + BudiR3;
        
        //--penentuan pemenang
        if (Andi > Budi){
            System.out.println("Andi");
        } else if (Andi == Budi){
            System.out.println("Seri");
        } else{
            System.out.println("Budi");
        }
    }  
}
