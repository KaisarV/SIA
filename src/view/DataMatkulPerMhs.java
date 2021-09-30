package view;

import Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Mahasiswa;

/**
 *
 * @author MrKaisar
 */
public class DataMatkulPerMhs {

    public DataMatkulPerMhs() {
        Controller controller = new Controller();
        String nim = JOptionPane.showInputDialog("Masukkan NIM : ");

        Mahasiswa mahasiswa = controller.getObjectMhsByNIM(nim);
        if (mahasiswa.getNama() == null) {
            JOptionPane.showMessageDialog(null, "NIM tidak ditemukan");
        } else {
            String data = controller.getMatkulPerMahasiswa(mahasiswa);

            JOptionPane.showMessageDialog(null, data);
        }

    }

}
