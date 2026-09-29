import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan berapa meter tanah:");
        int meterTanah = scanner.nextInt();

        Tanah tanah = new Tanah();
        tanah.tanah = meterTanah;
        int totalHarga = tanah.TotalHargaTanah();
            System.out.println("Total harga tanah dengan per-"+meterTanah+" meter adalah RP."+ totalHarga);

    }
}