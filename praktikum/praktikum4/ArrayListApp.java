package praktikum.praktikum4;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> mahasiswa = new ArrayList<String>();

        mahasiswa.add("Udin");
        System.out.println(mahasiswa.get(0));
        mahasiswa.set(0, "Udin Bakar");
        System.out.println(mahasiswa.get(0));

        int stopper = 0;
        do{
        System.out.print("input nama:");
        mahasiswa.add(scanner.nextLine());
        stopper++;

        }while(stopper != 2);

        mahasiswa.remove(1);
        System.out.println("=== Daftar Mahasiswa ===");
        for(String nama : mahasiswa){
            System.out.println("- "+nama);
        }

        System.out.print("Nama paling akhir:");
        mahasiswa.getLast();
        mahasiswa.clear();
         System.out.println("=== Setelah clear===");
        for(String nama : mahasiswa){
            System.out.println("- "+nama);
        }

        
    }
}