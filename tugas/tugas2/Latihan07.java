package tugas.tugas2;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resto resto = new Resto();
        String ulang = "Y";

        do {
            resto.chooseMenu();

            if (resto.inputMenu >= 1 && resto.inputMenu <= 3) {
                long harga = resto.getHargaMenu();
                String namaMenu = switch (resto.inputMenu) {
                    case 1 -> "Nasi Goreng";
                    case 2 -> "Bubur Ayam";
                    case 3 -> "Soto Ayam";
                    default -> "";
                };

                System.out.printf("Anda memesan %s dengan harga Rp. %,d%n", namaMenu, harga);

                System.out.print("Apakah anda akan memesan kembali ? (y/n): ");
                ulang = scanner.next().toUpperCase();

                if (ulang.equals("N")) {
                    break;
                }
            } else if (resto.inputMenu == 4) {
                break;
            } else {
                System.out.println("Inputan tidak sesuai.");
            }
        } while (resto.inputMenu != 4 && ulang.equals("Y"));

        System.out.println("Terimakasih telah memesan.");
        scanner.close();
    }
}