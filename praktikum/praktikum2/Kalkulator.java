    package praktikum.praktikum2;

    import java.util.Scanner;
    public class Kalkulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double a,b;
            char again = 'Y';

            System.out.println("=== Kalkulator ===");

            do{
            System.out.print("Input A:");
            a = scanner.nextDouble();
            System.out.print("Input B:");
            b = scanner.nextDouble();

            System.out.print("Mau operasi apa(+,-,/,*):");
            char operator = scanner.next().charAt(0);
            
            double hasil = hitung(a,b,operator);
            System.out.println("Hasil:" + hasil);

            System.out.print("Ulangi(Y/N):");
            again = scanner.next().charAt(0);

            }while(Character.toUpperCase(again) == 'Y');        
            scanner.close();
        }
        static double hitung(double x, double y, char operator){

            return switch (operator) {
               case '+' -> x + y;
               case '-' -> x - y;
               case '*' -> x * y;
               case '/' -> {
                if (y == 0) {
                    System.out.println("Pembagian tidak boleh dengan 0");
                    yield 0;
                }
                yield x / y;
               }
               default -> {
                System.out.println("Operator tidak ada didalam list");
                yield 0;
               }
            };

        }
        
    }
