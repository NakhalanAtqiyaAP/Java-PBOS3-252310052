package tugas.tugas4;

import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        String[] field = new String[3];
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

        field[0] = nama;
        field[1] = noTelp;
        field[2] = alamat;

        JOptionPane.showMessageDialog(
            null, 
            "Nama lengkap: "+ field[0]+"\n"+
            "NO Telephone: "+field[1]+"\n"+
            "Alamat      : "+field[2],
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );

        
    }
}