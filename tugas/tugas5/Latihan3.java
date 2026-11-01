package tugas.tugas5;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Latihan3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> biodata = new ArrayList<>();
        String field[] = {"Nama", "Alamat", "No Telephone"};

        int inputData = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Masukkan Jumlah Data yang Ingin Dibuat:",
                    "Input Data" ,
                    JOptionPane.QUESTION_MESSAGE
                ));
                

        for (int i = 0; i < inputData; i++) {
            biodata.add(new ArrayList<>());
            for (int j = 0; j < inputData; j++) {
                String input = JOptionPane.showInputDialog(
                    null,
                    "Masukkan " + field[j] + " (Data ke-" + (i + 1) + "):",
                    "Input Biodata ke-" + (i + 1),
                    JOptionPane.QUESTION_MESSAGE
                );
                biodata.get(i).add(input != null ? input : "");
            }
        }   
        
        StringBuilder output = new StringBuilder();

        output.append("=== DATA BIODATA ===\n\n");

        for (int i = 0; i < biodata.size(); i++) {
            output.append("Data ke-").append(i + 1).append(":\n");
            output.append("Nama Lengkap : ").append(biodata.get(i).get(0)).append("\n");
            output.append("Alamat       : ").append(biodata.get(i).get(1)).append("\n");
            output.append("No Telp      : ").append(biodata.get(i).get(2)).append("\n\n");
        }

        JOptionPane.showMessageDialog(
            null,
            output.toString(),
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

}