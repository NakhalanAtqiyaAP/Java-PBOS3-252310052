package tugas.tugas4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {
    public static void main(String[] args) {
        ArrayList<String> field = new ArrayList<>();
        String nama, noTelp, alamat;

        nama = JOptionPane.showInputDialog(
            null,
            "Input nama:",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        );

        noTelp = JOptionPane.showInputDialog(
            null,
            "Input noTelp:",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        );

        alamat = JOptionPane.showInputDialog(
            null,
            "Input alamat:",
            "Input",
            JOptionPane.QUESTION_MESSAGE
        );

        field.add(nama);   
        field.add(noTelp); 
        field.add(alamat); 

        JOptionPane.showMessageDialog(
            null, 
            "Nama lengkap: " + field.get(0) + "\n" +
            "NO Telephone: " + field.get(1) + "\n" +
            "Alamat      : " + field.get(2),
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
