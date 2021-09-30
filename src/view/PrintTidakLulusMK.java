
package view;

import Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Mahasiswa;

/**
 *
 * @author MrKaisar
 */
public class PrintTidakLulusMK {
    
    public PrintTidakLulusMK(){
        Controller controller = new Controller();
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ");
        
        //Search object Mahasiswa in User
        ArrayList<Mahasiswa> dataMhs = new ArrayList<>();
        dataMhs = controller.getObjectMahasiswa();
        
        int jumlahTidakLulus = controller.hitungTidakLulusMK(dataMhs, kodeMK);
        int jumlahMahasiswa = controller.totalMahasiswaSuatuMK(dataMhs, kodeMK);
        JOptionPane.showMessageDialog(null, jumlahTidakLulus + " dari " + jumlahMahasiswa 
                + " mahasiswa tidak lulus matakuliah " + controller.getNamaMatkul(kodeMK));
    
    }
    
}
