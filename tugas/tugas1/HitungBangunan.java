import java.util.Scanner;
public class HitungBangunan {
    static Scanner scanner = new Scanner(System.in);
    static int input;
    public static void main(String[] args) {
        
        do{
        System.out.println("1. Layang-layang");
        System.out.println("2. Prisma segitiga");
        System.out.println("3. Keluar");
        System.out.print("Silakan pilih:");
        input = scanner.nextInt();
        switch(input){
            case 1 -> layangLayang();
        }

        }while(input != 3);
        
    }

    public static void layangLayang(){
        System.out.println("=== Hitung Luas Layang-Layang ===");
        System.out.print("Masukan d1:");
        double d1 = scanner.nextDouble();
        System.out.print("Masukan d2:");
        double d2 = scanner.nextDouble();

        System.out.println("=== Hitung Keliling Layang-Layang ===");
        System.out.println("Berapa sisi(1-4):");
        int n= scanner.nextInt();

        if (n > 4) n = 4;
        if (n < 1) n = 1;

        double[] sisi = new double[4];
        double totalSisi = 0;

        for(int i = 0; i < n; i++){
           System.out.print("Input sisi ke-"+(i+1)+":");
           double inputSisi = scanner.nextDouble();
           sisi[i] =  inputSisi;
          totalSisi += sisi[i] ;
        }
        double hasilLuas = 0.5 * d1 * d2;
        double hasilKeliling = totalSisi * 2;

        System.out.println("Hasil luas layang-layang:"+ hasilLuas);
        System.out.println("Hasil keliling layang-layang:"+hasilKeliling);
    }
}