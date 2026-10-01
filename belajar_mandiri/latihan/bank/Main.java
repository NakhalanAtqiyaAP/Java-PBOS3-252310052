package bank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Account acc1 = new Account("1907273488321", "nakhalan", 2000000000);
        Account acc2 = new Account("1907298844112", "udin", 10000);
        Account selectedAccount = null;
        int input;

        System.out.println("=== ATM ===");
        System.out.println("Silakan pilih acc");
        System.out.println("1. Nakhalan");
        System.out.println("2. Udin");
        System.out.print(":");
        int accInput = scanner.nextInt();

        switch (accInput) {
           case 1 -> selectedAccount = acc1;
           case 2 -> selectedAccount = acc2;
        }

        do{
       System.out.println("1. Cek Saldo");
       System.out.println("2. Deposit");
       System.out.println("3. Tarik Saldo");
       System.out.println("4. Keluar");
       System.out.print(":");
       input = scanner.nextInt();
       switch(input){
        case 1 -> 
            selectedAccount.displayInfo();
        case 2 ->{
            System.out.print("Masukan jumlah deposit:");
            double deposit = scanner.nextDouble();
            selectedAccount.deposit(deposit);
        }
        case 3 -> {
            System.out.println("Masukan jumlah penarikan:");
            double withDraw = scanner.nextDouble();
            selectedAccount.withDraw(withDraw);
        }
        case 4 ->{
            System.out.println("Proses selesai");
        }
        default -> {
            System.out.println("Pilihan menu tidak valid");
        }
       }
        }while(input != 4);
    System.out.println("=== Terimakasih telah menggunakan jasa ATM ===");
    scanner.close();
    }
}
