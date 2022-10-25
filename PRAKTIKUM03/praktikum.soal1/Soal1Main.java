package praktikum3.soal1;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dd = new Dadu();
        int inputnilai = input.nextInt();

        dd.setInput(inputnilai);
        dd.acakDadu();
    }    
}
