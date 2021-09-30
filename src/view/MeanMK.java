package view;

import Controller.Controller;
import model.Mahasiswa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MrKaisar
 */
public class MeanMK {

    public MeanMK() {
        Controller controller = new Controller();
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ");
        boolean cek = controller.getMatkulByKode(kodeMK);
        
        if (cek == true) {
            ArrayList<Mahasiswa> dataMhs = new ArrayList<>();

            dataMhs = controller.getObjectMahasiswa();

            String getMean = controller.hitungMeanMK(dataMhs, kodeMK);
            
            JOptionPane.showMessageDialog(null, getMean);
        }else {
        
            JOptionPane.showMessageDialog(null, "MK tidak ditemukan", "Warning",
                            JOptionPane.WARNING_MESSAGE);
        }

    }

}
