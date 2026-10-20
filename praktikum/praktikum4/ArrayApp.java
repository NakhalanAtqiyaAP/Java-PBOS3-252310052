package praktikum.praktikum4;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nama = new String[5];

        nama[0] = "Faisal";
        nama[1] = "Udin";
        nama[2] = "Prabowo";
        nama[3] = "Bahlil";
        nama[4] = "Gibran";

        for(String mhs : nama){
            System.out.println("- "+mhs);
        }

        int[] angka = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println(angka[i] = i * 2);
        }
                
    }
}