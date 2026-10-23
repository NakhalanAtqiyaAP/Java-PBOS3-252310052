package tugas.tugas4;

import java.util.Scanner;
import  javax.swing.JOptionPane;
import java.util.Arrays;

public class Latihan03 {
    public static void main(String[] args) {

        
        int jumArray = Integer.parseInt(JOptionPane.showInputDialog(
            null,
            "Input jumlah array:",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        ));

        int[] angka = new int[jumArray];
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < jumArray; i++){
            System.out.print("Masukan angka ke-"+(i+1)+":");
            int input = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Input angka ke-"+(i+1)+" :",
                "Input",
                JOptionPane.QUESTION_MESSAGE
            ));
            angka[i] = input;
        }

        for(int i = 0; i < jumArray; i++){
            output.append("X ["+(i)+"] ="+ angka[i]+"\n"); 
        }
        JOptionPane.showMessageDialog(
            null, 
            "Output:\n"+ output.toString(),
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}