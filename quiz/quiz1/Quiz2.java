package quiz.quiz1;

import javax.swing.JOptionPane;

public class Quiz2 {
    public static void main(String[] args) {
        
        System.out.println("Input data: ");
        int jumlah = Integer.parseInt (JOptionPane.showInputDialog(
            null,
            "Input data: ",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        ));

        int[] angka = new int[jumlah];


        for (int i = 0; i < jumlah; i++){
            int input = Integer.parseInt (JOptionPane.showInputDialog(
                null,
                "Masukan data ke i- ",
                "Input",
                JOptionPane.QUESTION_MESSAGE
            )); 
        }
        
    }
}