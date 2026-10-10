import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class latihan10  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students member = new Students();

        System.out.println("======================================================");
        System.out.println("TOKO SERBAGUNA IBIK");
        System.out.println("======================================================");

        System.out.println("Masukan nama member :");
        String nama = scanner.nextLine();
        member.setFullname(nama);

        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = scanner.nextInt();

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", new Locale("id", "ID"));
        String waktuFormatted = time.format(formatter);

        String namaProduk = "ROTI ENAK";
        int harga = 6300;

        int totalAwal = qty * harga;

        int kelipatan = qty / 3;
        int persentaseDiskon = kelipatan * 5;
        double jumlahDiskon = totalAwal * (persentaseDiskon / 100.0);
        double subTotal = totalAwal - jumlahDiskon;

        System.out.println(waktuFormatted);
        System.out.println("ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.println("======================================================");
        System.out.printf("%-12s\t%d\tRp %,d,-\tRp %,d\n", namaProduk + ".", qty, harga, totalAwal);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Diskon    : " + persentaseDiskon + "%");
        System.out.printf("Sub Total : Rp %,.0f,-\n", subTotal);

        System.out.println("Nama member : "+member.getFullname());

        scanner.close();
    }
}