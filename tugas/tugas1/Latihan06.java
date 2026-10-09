import java.util.Scanner;
public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Usia:");
        String usia = scanner.nextLine();
        System.out.print("Masukan First Name:");
        String firstName = scanner.nextLine();
        System.out.print("Masukan Last Name:");
        String lastName = scanner.nextLine();
        System.out.print("Masukan NPM:");
        String npm = scanner.nextLine();

        String hasil = usia.concat(firstName).concat(lastName).concat(npm);
        System.out.print(hasil);
    }
}