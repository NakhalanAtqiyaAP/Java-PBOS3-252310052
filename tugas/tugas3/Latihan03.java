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

        String inputUsiaStr = JOptionPane.showInputDialog(
            null,
            "Masukan Usia:",
            "Input Usia",
            JOptionPane.QUESTION_MESSAGE
        );
        int inputUsia = 0;
        try{
            inputUsia =Integer.parseInt(inputUsiaStr);
        }catch(NumberFormatException e){
            inputUsia = 0;
        }

        String inputAlamat = JOptionPane.showInputDialog(
            null,
            "Masukan Alamat:",
            "Input Alamat",
            JOptionPane.QUESTION_MESSAGE
        );

        mhs.setBiodata(inputName, inputUsia, inputAlamat);

        String output = "=== Data Mahasiswa === \n"+
                        "FullName   = "+ mhs.getFullName()+"\n"+
                        "Usia       ="+ mhs.getUsia()+"\n"+
                        "Alamat     ="+ mhs.getAlamat()+"\n";

        JOptionPane.showMessageDialog(
            null,
             output,
             "Output",
             JOptionPane.INFORMATION_MESSAGE
            );


    }
}
