
package view;

import javax.swing.JOptionPane;
import model.User;
import Controller.Controller;
/**
 *
 * @author MrKaisar
 */
public class ScreenGaji {
    
    
    public ScreenGaji(){
        
        Controller controller = new Controller();
        String NIK = JOptionPane.showInputDialog(null, "Masukkan NIK staff : ");
        
        User data =  controller.getUserByNIK(NIK);
        
        String caption = controller.getGaji(data);
        
        JOptionPane.showMessageDialog(null, caption);
    }
}
