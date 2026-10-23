package tugas.tugas4;

import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriksA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Masukkan elemen Matriks A\nBaris ke-" + (i + 1) + " Kolom ke-" + (j + 1) + " :",
                    "Input Matriks A",
                    JOptionPane.QUESTION_MESSAGE
                ));
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriksB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Masukkan elemen Matriks B\nBaris ke-" + (i + 1) + " Kolom ke-" + (j + 1) + " :",
                    "Input Matriks B",
                    JOptionPane.QUESTION_MESSAGE
                ));
            }
        }

        int[][] hasilJumlah = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasilJumlah[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        StringBuilder output = new StringBuilder();
        
        output.append("Matriks A:\n");
        for (int i = 0; i < 2; i++) {
            output.append("[  ").append(matriksA[i][0]).append("    ").append(matriksA[i][1]).append("  ]\n");
        }

        output.append("Matriks B:\n");
        for (int i = 0; i < 2; i++) {
            output.append("[  ").append(matriksB[i][0]).append("    ").append(matriksB[i][1]).append("  ]\n");
        }

        output.append("Hasil:\n");
        for (int i = 0; i < 2; i++) {
            output.append("[  ").append(hasilJumlah[i][0]).append("    ").append(hasilJumlah[i][1]).append("  ]\n");
        }

        JOptionPane.showMessageDialog(
            null,
            output.toString(),
            "Output",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
