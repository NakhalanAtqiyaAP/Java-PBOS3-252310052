package tugas.tugas2;

import java.util.Scanner;
public class latihan02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan sebuah inputan:");
        int inputan = scanner.nextInt();

        boolean isPrima = true;

        if (inputan <= 1) {
            isPrima = false;
        }else{
             for (int i = 2; i <= Math.sqrt(inputan); i++) {
                if (inputan % i == 0) {
                    isPrima = false;
                    break;
        }
    }
    if(isPrima){
        System.out.println(inputan+" Adalah bilangan prima");
    }else{
        System.out.println(inputan+" Bukanlah bilangan prima");
    }

    }
    }
}
