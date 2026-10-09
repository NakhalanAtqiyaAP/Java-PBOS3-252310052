import java.util.Scanner;
public class KonversiSuhu {
    
    public static void main(String[] args) {
        double celcius; 
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konversi Celcius ===");
        do{

        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Celcius ke Reamur");
        System.out.println("3. Celcius ke Kelvin");
        System.out.println("4. Keluar");
        System.out.print("Silakan pilih: ");
        input = scanner.nextInt();
        if (input >= 1 && input <= 3) {
                System.out.print("Masukkan suhu Celcius: ");
                celcius = scanner.nextDouble();

                switch (input) {
                    case 1 -> System.out.println("Hasil: " + celciusToFahreheit(celcius) + " °F"); 
                    case 2 -> System.out.println("Hasil: " + celciusToReamur(celcius) + " °R");
                    case 3 -> System.out.println("Hasil: " + celciusToKelvin(celcius) + " K");
                }
            }else if(input != 4){
                System.out.println("Input tidak valid!");
            }
        }while(input != 4);
        System.out.println("Program berakhir...");
        scanner.close();
        
    }

    public static double celciusToFahreheit(double celcius){
        return (celcius * 9.0 / 5.0) + 32;
    }

    public static double celciusToReamur(double celcius){
        return 4.0 / 5.0 * celcius;
    }

    public static double celciusToKelvin(double celcius){
        return celcius + 273.15;
    }

}