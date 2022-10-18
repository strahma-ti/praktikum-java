package PRAK201_2110817120011_SitiRahmah;

public class Soal1Main {
    public static void main(String []args){
    Mangga Arumanis = new Mangga("Arumanis", "hijau kekuning-kuningan", "lembut", "manis", 0.3, 13, 3.9, 5000, 65000);
    Mangga Manalagi = new Mangga("Manalagi", "hijau", "kasar", "manis", 0.5, 17, 8.5, 7500, 127500);
    Mangga Madu = new Mangga("Mangga Madu", "kuning", "lembut", "manis", 0.375, 12, 4.5, 6500, 780000);
    
    Arumanis.display();
    Manalagi.display();
    Madu.display();
    } 
}
