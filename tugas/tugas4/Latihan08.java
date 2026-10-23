package tugas.tugas4;

import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        int jumlahData = Integer.parseInt(JOptionPane.showInputDialog(
            null,
            "Masukkan jumlah data yang ingin diinput:",
            "Input Jumlah Data",
            JOptionPane.QUESTION_MESSAGE
        ));

        String[][] data = new String[jumlahData][3];

        for (int i = 0; i < jumlahData; i++) {
            JOptionPane.showMessageDialog(null, "Menginput data ke-" + (i + 1));
            
            data[i][0] = JOptionPane.showInputDialog(
                null, 
                "Input nama:",
                 "Input Data ke-" + (i + 1), 
                 JOptionPane.QUESTION_MESSAGE
            );

            data[i][1] = JOptionPane.showInputDialog(
                null,
                 "Input noTelp:", 
                 "Input Data ke-" + (i + 1),
                  JOptionPane.QUESTION_MESSAGE
            );

            data[i][2] = JOptionPane.showInputDialog(
                null, 
                "Input alamat:",
                 "Input Data ke-" + (i + 1), 
                 JOptionPane.QUESTION_MESSAGE
            );
        }

        StringBuilder output = new StringBuilder("=== DAFTAR DATA OUTPUT ===\n\n");
        for (int i = 0; i < jumlahData; i++) {
            output.append("Data ke-").append(i + 1).append(":\n");
            output.append("Nama lengkap: ").append(data[i][0]).append("\n");
            output.append("NO Telephone: ").append(data[i][1]).append("\n");
            output.append("Alamat      : ").append(data[i][2]).append("\n");
            output.append("--------------------------------------------------\n");
        }

        JOptionPane.showMessageDialog(
            null, 
            output.toString(),
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
