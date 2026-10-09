import java.util.Scanner;

public class HitungBangunan {
    static Scanner scanner = new Scanner(System.in);
    static int inputMain;
    static int inputPrisma;

    public static void main(String[] args) {
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Layang-layang");
            System.out.println("2. Prisma segitiga");
            System.out.println("3. Keluar");
            System.out.print("Silakan pilih: ");
            inputMain = scanner.nextInt();

            if (inputMain >= 1 && inputMain <= 2) {
                switch (inputMain) {
                    case 1 -> layangLayang();
                    case 2 -> prismaSegitiga();
                }
            } else if (inputMain == 3) {
                System.out.println("Keluar dari program utama.");
            } else {
                System.out.println("Pilihan tidak valid! Masukkan angka 1 - 3.");
            }
        } while (inputMain != 3);

        System.out.println("Program Berhenti");
        scanner.close();
    }

    public static void layangLayang() {
        System.out.println("\n=== Hitung Luas Layang-Layang ===");
        System.out.print("Masukan d1: ");
        double d1 = scanner.nextDouble();
        System.out.print("Masukan d2: ");
        double d2 = scanner.nextDouble();

        System.out.println("=== Hitung Keliling Layang-Layang ===");
        System.out.print("Berapa sisi yang ingin diinput secara manual? (Maksimal 4): ");
        int n = scanner.nextInt();

        if (n > 4) n = 4;
        if (n < 1) n = 1;

        double[] sisi = new double[4];
        double totalSisi = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Input sisi ke-" + (i + 1) + ": ");
            double inputSisi = scanner.nextDouble();
            sisi[i] = inputSisi;
            totalSisi += sisi[i];
        }

        double hasilLuas = 0.5 * d1 * d2;
        double hasilKeliling = totalSisi; 

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Hasil luas layang-layang    : " + hasilLuas);
        System.out.println("Hasil keliling layang-layang: " + hasilKeliling);
    }

    public static void prismaSegitiga() {
        System.out.println("\n=== Prisma Segitiga ===");
        do {
            System.out.println("\nMenu Utama Prisma Segitiga:");
            System.out.println("1. Luas dan Keliling");
            System.out.println("2. Volume");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih menu (1-3): ");
            inputPrisma = scanner.nextInt();

            if (inputPrisma >= 1 && inputPrisma <= 2) {
                switch (inputPrisma) {
                    case 1 -> {
                        System.out.println("\n=== Hitung Luas & Keliling ===");
                        System.out.print("Masukkan alas segitiga: ");
                        double a = scanner.nextDouble();
                        System.out.print("Masukkan tinggi segitiga: ");
                        double ts = scanner.nextDouble();
                        System.out.print("Masukkan panjang sisi segitiga 1: ");
                        double s1 = scanner.nextDouble();
                        System.out.print("Masukkan panjang sisi segitiga 2: ");
                        double s2 = scanner.nextDouble();
                        System.out.print("Masukkan panjang sisi segitiga 3: ");
                        double s3 = scanner.nextDouble();
                        System.out.print("Masukkan tinggi prisma: ");
                        double tPrisma = scanner.nextDouble();

                        double luasAlas = 0.5 * a * ts;
                        double kelilingAlas = s1 + s2 + s3;

                        double luasPermukaan = (2 * luasAlas) + (kelilingAlas * tPrisma);
                        double kelilingRangka = (2 * kelilingAlas) + (3 * tPrisma);

                        System.out.println("\n=== Hasil Perhitungan ===");
                        System.out.println("Luas Permukaan Prisma : " + luasPermukaan);
                        System.out.println("Keliling Rangka Prisma: " + kelilingRangka);
                    }
                    case 2 -> {
                        System.out.println("\n=== Hitung Volume Prisma ===");
                        System.out.print("Masukkan alas segitiga: ");
                        double a = scanner.nextDouble();
                        System.out.print("Masukkan tinggi segitiga: ");
                        double ts = scanner.nextDouble();
                        System.out.print("Masukkan tinggi prisma: ");
                        double tPrisma = scanner.nextDouble();

                        double luasAlas = 0.5 * a * ts;
                        double volume = luasAlas * tPrisma;

                        System.out.println("\n=== Hasil Perhitungan ===");
                        System.out.println("Volume Prisma Segitiga: " + volume);
                    }
                }
            } else if (inputPrisma == 3) {
                System.out.println("Kembali ke Menu Utama...");
            } else {
                System.out.println("Pilihan tidak valid! Masukkan angka 1 - 3.");
            }
        } while (inputPrisma != 3);
    }
}
