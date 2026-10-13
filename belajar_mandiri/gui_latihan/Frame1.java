package gui_latihan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 

public class Frame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Latihan");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Memoisikan jendela ke tengah layar

        //Membuat panel dann tombol
        JPanel panel = new JPanel();
        JButton tombol = new JButton("Tampilkan Pop-Up");

        // Menambahkan event listener saat tombol diklik
        tombol.addActionListener(e ->{
            JOptionPane.showMessageDialog(
                frame,
                "HEI ANTEK-ANTEK ASENG!",
                "Notifikasi",
                JOptionPane.INFORMATION_MESSAGE
            );
        });
        // Menyusun komponen ke dalam frame
        panel.add(tombol);
        frame.add(panel);

        // menampilkan jendela
        frame.setVisible(true);
    }
}
