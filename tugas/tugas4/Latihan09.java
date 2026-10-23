package tugas.tugas4;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Latihan09 {
    public static void main(String[] args) {

        int jumArray = Integer.parseInt(JOptionPane.showInputDialog(
            null,
            "Input jumlah array:",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        ));

        ArrayList<Integer> angka = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < jumArray; i++) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Input angka ke-" + (i + 1) + " :",
                "Input",
                JOptionPane.QUESTION_MESSAGE
            ));
            angka.add(input); 
        }

        for (int i = 0; i < jumArray; i++) {
            output.append("X [").append(i).append("] = ").append(angka.get(i)).append("\n"); // Menggunakan .get()
        }

        int terkecil = Collections.min(angka);
        int terbesar = Collections.max(angka);

        JOptionPane.showMessageDialog(
            null, 
            "Output:\n" + output.toString() + "\n" +
            "Nilai Terbesarnya adalah " + terbesar + "\n" +
            "Nilai Terkecilnya adalah " + terkecil,
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
