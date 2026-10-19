package tugas.tugas3;

import javax.swing.JOptionPane;
public class Latihan03 {
    public static void main(String[] args) {
        Biodata mhs = new Biodata();

        
        String inputName = JOptionPane.showInputDialog(
            null,
            "Masukan Nama Lengkap:",
            "Input Nama",
            JOptionPane.QUESTION_MESSAGE
        );

        if (inputName == null) {
            JOptionPane.showConfirmDialog(
                null,
                 "Field nama tidak boleh kosong!",
                 "Error",
                 JOptionPane.WARNING_MESSAGE
                );
                return;
        }

        String inputUsiaStr = JOptionPane.showInputDialog(
            null,
            "Masukan Usia:",
            "Input Usia",
            JOptionPane.QUESTION_MESSAGE
        );
        if (inputUsiaStr == null || inputUsiaStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null, 
                "Field usia tidak boleh kosong", 
                "Error", 
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        int inputUsia = 0;
        try {
            inputUsia = Integer.parseInt(inputUsiaStr.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Isian usia harus angka", 
                "Error", 
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String inputAlamat = JOptionPane.showInputDialog(
            null,
            "Masukan Alamat:",
            "Input Alamat",
            JOptionPane.QUESTION_MESSAGE
        );

        if (inputAlamat == null || inputAlamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null, 
                "Field alamat tidak boleh kosong", 
                "Error", 
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        if (inputAlamat.trim().length() < 10) {
            JOptionPane.showMessageDialog(
                null, 
                "Masukan alamat minimum 10 karakter", 
                "Warning", 
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        mhs.setBiodata(inputName, inputUsia, inputAlamat);

        String output = "=== Data Mahasiswa === \n"+
                        "FullName   = "+ mhs.getFullName()+"\n"+
                        "Usia       ="+ mhs.getUsia()+"\n"+
                        "Alamat     ="+ mhs.getAlamat()+"\n";

        JOptionPane.showMessageDialog(
            null,
             output,
             "Info",
             JOptionPane.INFORMATION_MESSAGE
            );


    }
}
