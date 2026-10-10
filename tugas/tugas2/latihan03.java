package tugas.tugas2;
import java.util.Scanner;
public class latihan03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu Makanan ===");
       int inputan;

        do{
        System.out.println("1. Nasi Goreng ------------ Rp. 22.000");
        System.out.println("2. Bubur Ayam ------------- Rp. 15.000");
        System.out.println("3. Soto Ayam -------------- Rp. 25.000");
        System.out.println("4. Keluar");
        System.out.print("Input:");
        inputan = scanner.nextInt();

        if(inputan >= 1 && inputan <= 3){
            
        switch (inputan){
            case 1 -> System.out.println("Anda memesan Nasi Goreng dengan harga Rp. 22.000");
            case 2 -> System.out.println("Anda memesan Bubur Ayam dengan harga Rp. 15.000");
            case 3 -> System.out.println("Anda memesan Soto Ayam dengan harga Rp. 25.000");
        }
        }else if(inputan == 4){
            System.out.println("Program Berhenti...");
        }else{
            System.out.println("Inputan tidak sesuai");
        }
        }while(inputan != 4);
        System.out.println("Terimakasih telah memakai program kami!");
        

    }
}