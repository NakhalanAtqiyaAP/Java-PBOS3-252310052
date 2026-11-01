package tugas.tugas5;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriksA = new ArrayList<>();
         ArrayList<ArrayList<Integer>> matriksB = new ArrayList<>();
 
        for (int i = 0; i < 2; i++) {
            matriksA.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(
                    null,
                    "Masukkan nilai Matriks A baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ":",
                    "Input Matriks A",
                    JOptionPane.QUESTION_MESSAGE
                );
                matriksA.get(i).add(Integer.parseInt(input));
            }
        }   
        
           for (int i = 0; i < 2; i++) {
            matriksB.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(
                    null,
                    "Masukkan nilai Matriks A baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ":",
                    "Input Matriks A",
                    JOptionPane.QUESTION_MESSAGE
                );
                matriksB.get(i).add(Integer.parseInt(input));
            }
        }    
        StringBuilder output = new StringBuilder();

        output.append("Matrix A:\n");
        for (int i = 0; i < 2; i++) {
            output.append("[ ");
            for (int j = 0; j < 2; j++) {
                output.append(matriksA.get(i).get(j)).append(" ");
            }
            output.append("]\n");
        }

        output.append("\nMatrix B:\n");
        for (int i = 0; i < 2; i++) {
            output.append("[ ");
            for (int j = 0; j < 2; j++) {
                output.append(matriksB.get(i).get(j)).append(" ");
            }
            output.append("]\n");
        }

        JOptionPane.showMessageDialog(
            null,
            output.toString(),
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

}