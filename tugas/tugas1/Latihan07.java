import java.util.Scanner;
public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan sebuah kata:");
        String input = scanner.nextLine().replaceAll("[aiueoAIUEO]", "X");
        System.out.println(input);
    }
}