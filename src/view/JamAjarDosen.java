
package view;

import javax.swing.JOptionPane;
import model.Dosen;
import Controller.Controller;
import model.User;

/**
 *
 * @author MrKaisar
 */
public class JamAjarDosen {
    
    public JamAjarDosen() {
        String NIK = JOptionPane.showInputDialog(null,"Masukkan NIK : ");
        
        Controller controller = new Controller();
        
        User dosen = controller.getUserByNIK(NIK);
        
        if (dosen == null) {
            JOptionPane.showMessageDialog(null, "NIK tidak ditemukan", "Warning",
                            JOptionPane.WARNING_MESSAGE);
        }else{
            System.out.println(dosen.getNama());
            int jam = controller.getJamDosen(dosen);
        JOptionPane.showMessageDialog(null, "Total jam : " + jam);
        }
        
        
        
        
    }
}
