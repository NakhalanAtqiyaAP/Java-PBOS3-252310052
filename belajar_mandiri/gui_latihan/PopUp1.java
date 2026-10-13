package gui_latihan;

import javax.swing.JOptionPane;

public class PopUp1 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(
            null,
            "Selamat datang di modul GUI Java!",
            "Informasi",
            JOptionPane.INFORMATION_MESSAGE
        );

        String presiden = JOptionPane.showInputDialog(
            null,
            "Masukan pilihan capres Anda:",
            "Input Presiden",
            JOptionPane.QUESTION_MESSAGE
        );

        if(presiden!= null && !presiden.trim().isEmpty()){
            int konfirmasi = JOptionPane.showConfirmDialog(
                null,
               "Apakah pilihanmu sudah tepat dengan memilih "+ presiden + " ?",
               "KOnfirmasi Data",
               JOptionPane.YES_NO_OPTION
            );
            if (konfirmasi == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Terimakasih telah memilih "+ presiden+" !",
                    "Sukses",
                    JOptionPane.INFORMATION_MESSAGE
                
                );
            }else{
                JOptionPane.showMessageDialog(
                    null,
                     "Kamu antek-antek aseng!",
                     "Peringatan",
                     JOptionPane.WARNING_MESSAGE
                    );
            }
        }
    }
}
