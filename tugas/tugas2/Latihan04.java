package tugas.tugas2;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputan;

        do{
            System.out.println("Masukan sebuah angka(tidak boleh kurang dari 20):");
            inputan = scanner.nextInt();

            if (inputan < 20) {
                System.out.println("Inputan tidak boleh kurang dari 20");
            }
        }while(inputan < 20);

        System.out.println("Bilangan faktor "+inputan+" adalah: ");

        boolean coma = true;
        for(int i = 1; i <= inputan; i++){
            if (inputan % i == 0) {
                if (!coma) {
                    System.out.print(", ");
                }
                System.out.print(i);
                coma = false;
            }
        }
    }
}