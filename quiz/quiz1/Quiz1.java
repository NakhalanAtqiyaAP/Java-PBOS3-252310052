package quiz.quiz1;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Quiz1 {
    public static ArrayList<String> buku = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      int inputan;
      
      String menu = "1. Tambah Buku\n"
                    +"2. Hapus Buku\n"
                    +"3. Output\n"
                    +"4. Keluar\n"
                    +"Input:";
        do{
        inputan = Integer.parseInt(JOptionPane.showInputDialog(
            null,
            menu,
            "Input Menu",
            JOptionPane.QUESTION_MESSAGE
        ));

        if(inputan >= 1 && inputan <= 3){
            
        switch (inputan){
            case 1 -> {
                buku.add(JOptionPane.showInputDialog(
                    null,
                    "Input nama buku:",
                    "Input Buku",
                    JOptionPane.QUESTION_MESSAGE
                ));
            }
            case 2 -> {
                int number = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Hapus hapus buku:",
                    "Hapus Buku",
                    JOptionPane.QUESTION_MESSAGE
                ));
                buku.remove(number);
            }
            case 3 ->{
          for (int i = 0; i < buku.size(); i++) {
            String output = buku.get(i);
            JOptionPane.showMessageDialog(null, output, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
                
            }
        }
        }else if(inputan == 4){
            System.out.println("Program Berhenti...");
        }else{
            System.out.println("Inputan tidak sesuai");
        }
        }while(inputan != 4);
        System.out.println("Terimakasih telah memakai program kami!");
    }
}

