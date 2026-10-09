import java.util.Scanner;
public class latihan08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int npm,ipk,semester;
        String nama,kelas;

        System.out.print("Masukan nama:");
        nama = scanner.nextLine();
        System.out.print("Masukan kelas:");
        kelas = scanner.nextLine();
        System.out.print("Masukan npm:");
        npm = scanner.nextInt();
        System.out.print("Masukan IPK:");
        ipk = scanner.nextInt();
        System.out.print("Masukan semester:");
        semester = scanner.nextInt();
        System.out.println("=== Biodata Mahasiswa ===");
        System.out.println("Nama Mahasiswa      :"+ nama);
        System.out.println("Kelas               :"+ kelas);
        System.out.println("NPM                 :"+ npm);
        System.out.println("Semester            :"+ semester);
        System.out.println("");
        System.err.println("IPK                 :"+ ipk);
        
    }
}