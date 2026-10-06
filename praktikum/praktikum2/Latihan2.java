package praktikum.praktikum2;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale lokal = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(lokal);

        System.out.print("Masukan berapa meter tanah:");
        int meterTanah = scanner.nextInt();

        Tanah tanah = new Tanah();
        tanah.tanah = meterTanah;
        int totalHarga = tanah.TotalHargaTanah();
        String formatUang = formatter.format(totalHarga);
            System.out.println("Total harga tanah dengan per-"+meterTanah+" meter adalah RP."+ formatUang);

    }
}