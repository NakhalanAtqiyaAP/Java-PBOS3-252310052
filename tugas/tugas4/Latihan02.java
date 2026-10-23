package tugas.tugas4;

import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan jumlah array:");
        int jumArray = scanner.nextInt();

        int[] angka = new int[jumArray];

        for(int i = 0; i < jumArray; i++){
            System.out.print("Masukan angka ke-"+(i+1)+":");
            int input = scanner.nextInt();
            angka[i] = input;
        }

        System.out.println("Output:");
        for(int output : angka){
            System.out.println("- "+output);
        }
    }
}