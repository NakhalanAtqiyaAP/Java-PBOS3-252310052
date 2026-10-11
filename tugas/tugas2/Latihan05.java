package tugas.tugas2;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 4 * i + 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < 4 * i + 3; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}