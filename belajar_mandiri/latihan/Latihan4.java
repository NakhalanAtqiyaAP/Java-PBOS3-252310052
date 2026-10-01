import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("Masukan jumlah mahasiswa :");

        int jumMahasiswa = scanner.nextInt();
        int[] mahasiswa = new int[jumMahasiswa];

        for(int i = 0; i < mahasiswa.length; i++){
         System.out.println("Masukan nilai ke-"+ i + " : ");
         mahasiswa[i] = scanner.nextInt();

         System.out.println("Mahasiswa ke-"+i+" : "+ mahasiswa[i]);
        }
       
        do{
        System.out.println("== Menu ==");
        System.out.println();
        System.out.println("1. Total Nilai");
        System.out.println("2. Rata-rata Nilai");
        System.out.println("3. Nilai Tertinggi");
        System.out.println("4. Nilai Terendah");
        System.out.println("5. Keluar");
        System.out.println("Pilih Menu 1-5:");
        input = scanner.nextInt();
        
        switch(input){
            case 1 -> {
                int totalNilai = 0;
                for(int i = 0; i < mahasiswa.length; i++){
                totalNilai = totalNilai + mahasiswa[i];
                }

                System.out.println("Total semua nilai mahasiswa jika digabung adalah "+ totalNilai);
              
            }
            case 2 -> {
                int totalNilai = 0;
                for(int mhs : mahasiswa){
                    totalNilai += mhs;
                }

                double rataRata = (double) totalNilai / mahasiswa.length;

                System.out.println("Nilai rata-rata dari semua mahasiswa adalah "+ rataRata);
            }
            case 3 -> {
                int max = mahasiswa[0];
                for(int i = 0; i < mahasiswa.length; i++){
                    if (mahasiswa[i] > max) {
                        max = mahasiswa[i];
                    }
                }
                System.out.println("Nilai tertinggi adalah "+ max);
            }
            case 4 ->{
                int min = mahasiswa[0];

                for(int i = 0; i < mahasiswa.length; i++){
                    if (mahasiswa[i] < min) {
                        min = mahasiswa[i];
                    }
                }
                 System.out.println("Nilai terkecil adalah "+min);
            }
        }
        }while(input != 5);

        scanner.close();


    }
}