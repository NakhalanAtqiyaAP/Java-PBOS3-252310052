package tugas.tugas2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Latihan10 {
    public static int pin = 252310052;
    public static double saldo = 2330000;
    public static double deposit, tarik;
    public static Locale lokal = new Locale("id", "ID");
    public static NumberFormat formatter = NumberFormat.getCurrencyInstance(lokal);

    public static void showSaldo(){
         System.out.println("Saldo Anda sekarang sebesar " + formatter.format(saldo));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percobaan = 3;
        boolean isValid = false;

        while (percobaan > 0 && !isValid) {
            System.out.print("Masukan PIN: ");
            int pinInput = scanner.nextInt();

            if (pinInput == pin) {
                isValid = true;
                System.out.println("PIN Benar! Akses diterima.\n");
            } else {
                percobaan--;
                System.out.println("PIN salah!");
                if (percobaan > 0) {
                    System.out.println("Sisa percobaan tersisa " + percobaan + " lagi\n");
                } else {
                    System.out.println("PIN salah 3 kali. Akun Anda terblokir!");
                }
            }
        }

        if (isValid) {
            String ulang = "Y";
            int input;

            do {
                System.out.println("=== MENU ATM ===");
                System.out.println("1. Lihat saldo");
                System.out.println("2. Deposit");
                System.out.println("3. Tarik saldo");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1-4): ");
                input = scanner.nextInt();

                switch (input) {
                    case 1 -> showSaldo();
                    case 2 -> {
                        System.out.print("Mau setor tunai berapa? Rp ");
                        deposit = scanner.nextDouble();

                        if (deposit < 10000) {
                            System.out.println("Nominal minimal setor tunai adalah Rp 10.000");
                        } else {
                            saldo += deposit;
                            System.out.println("Deposit berhasil!");
                            showSaldo();
                        }
                    }
                    case 3 -> {
                        System.out.print("Mau tarik tunai berapa? Rp ");
                        tarik = scanner.nextDouble();

                        if (tarik > saldo) {
                            System.out.println("Saldo Anda tidak mencukupi untuk menarik tunai.");
                        } else {
                            saldo -= tarik;
                            System.out.println("Penarikan berhasil!");
                            showSaldo();
                        }
                    }
                    case 4 -> System.out.println("Terima kasih telah menggunakan layanan kami.");
                    default -> System.out.println("Pilihan menu tidak valid!");
                }

                if (input >= 1 && input <= 3) {
                    System.out.print("\nApakah Anda ingin melakukan transaksi lain? (y/n): ");
                    ulang = scanner.next();
                    System.out.println();
                    if (ulang.equalsIgnoreCase("n")) {
                        System.out.println("Terima kasih telah menggunakan layanan kami.");
                        break;
                    }
                }

            } while (input != 4 && ulang.equalsIgnoreCase("y"));
        }

        scanner.close();
    }
}