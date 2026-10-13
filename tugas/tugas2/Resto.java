    package tugas.tugas2;

    import java.util.Scanner;

    public class Resto {
        private static long harga;
        public static Scanner scanner = new Scanner(System.in);
        public static int inputMenu;

        public static void chooseMenu(){

            System.out.println("1. Nasi Goreng ------------ Rp. 22.000");
            System.out.println("2. Bubur Ayam ------------- Rp. 15.000");
            System.out.println("3. Soto Ayam -------------- Rp. 25.000");
            System.out.println("4. Keluar");
            System.out.print("Input:");
            inputMenu = scanner.nextInt();
        
        }

        private static long getPrices(){
            switch (inputMenu) {
            case 1 -> harga = 22000;
            case 2 -> harga = 15000;
            case 3 -> harga = 25000;
            default -> harga = 0;
            }
            return harga;
        }

        public long getHargaMenu(){
            return getPrices();
        }
    }