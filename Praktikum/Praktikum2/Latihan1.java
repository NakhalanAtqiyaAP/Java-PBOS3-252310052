
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kubus kubus = new Kubus();
            System.out.println("=== Selamat Data Di Aplikasi Penghitung Kubus ===");  

            System.out.print("Masukan sisi kubus: ");
            int sisi = scanner.nextInt();
            kubus.sisi = sisi;

            int volume = kubus.HitungVolume();
            System.out.println("Volume dari kubus:"+volume);
    }
            
}
