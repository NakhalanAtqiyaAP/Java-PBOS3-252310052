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
        System.out.print("Berapa celcius:");
        celcius = scanner.nextInt();
            switch(input){
                case 1 -> System.out.println(celciusToFahreheit(celcius) + "F"); 
                case 2 -> System.out.println(celciusToReamur(celcius)+"R");
                case 3 -> System.out.println(celciusToKelvin(celcius)+"K");
            }
        }while(input != 4);
        
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