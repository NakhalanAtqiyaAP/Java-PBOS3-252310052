package tugas.tugas3;
import javax.swing.JOptionPane;

public class Latihan04 {

    private static boolean confirmDialog() {
        int pilihan = JOptionPane.showConfirmDialog(
            null, 
            "Apakah anda ingin keluar ?", 
            "Konfirmasi", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        return pilihan == JOptionPane.YES_OPTION;
    }

    public static void main(String[] args) {
        Biodata mhs = new Biodata();

        while (true) {
            String inputName = "";
            String inputUsiaStr = "";
            int inputUsia = 0;
            String inputAlamat = "";

            while (true) {
                inputName = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan Nama Lengkap (Fullname):", 
                    "Form Input Biodata", 
                    JOptionPane.QUESTION_MESSAGE
                );

                if (inputName == null) {
                    if (confirmDialog()) {
                        System.exit(0); 
                    } else {
                        continue; 
                    }
                }

                if (inputName.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Field fullname tidak boleh kosong", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                break; 
            }

            while (true) {
                inputUsiaStr = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan Usia (Tahun):", 
                    "Form Input Biodata", 
                    JOptionPane.QUESTION_MESSAGE
                );

                if (inputUsiaStr == null) {
                    if (confirmDialog()) {
                        System.exit(0);
                    } else {
                        continue;
                    }
                }

                if (inputUsiaStr.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Field usia tidak boleh kosong", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                try {
                    inputUsia = Integer.parseInt(inputUsiaStr.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Isian usia harus angka", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                break;
            }

            while (true) {
                inputAlamat = JOptionPane.showInputDialog(
                    null, 
                    "Masukkan Alamat:", 
                    "Form Input Biodata", 
                    JOptionPane.QUESTION_MESSAGE
                );

                if (inputAlamat == null) {
                    if (confirmDialog()) {
                        System.exit(0);
                    } else {
                        continue;
                    }
                }

                if (inputAlamat.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Field alamat tidak boleh kosong", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                if (inputAlamat.trim().length() < 10) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Masukan alamat minimum 10 karakter", 
                        "Warning", 
                        JOptionPane.WARNING_MESSAGE
                    );
                    continue;
                }

                break;
            }

            mhs.setBiodata(inputName.trim(), inputUsia, inputAlamat.trim());

            String hasilOutput = "=== DATA DIRI ===" + "\n" +
                                 "Fullname : " + mhs.getFullName() + "\n" +
                                 "Usia     : " + mhs.getUsia() + " Tahun\n" +
                                 "Alamat   : " + mhs.getAlamat();

            JOptionPane.showMessageDialog(
                null, 
                hasilOutput, 
                "Info Biodata", 
                JOptionPane.INFORMATION_MESSAGE
            );

            if (confirmDialog()) {
                System.exit(0); 
            }
        }
    }
}