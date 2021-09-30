package view;

import Controller.*;
import java.util.ArrayList;
import model.Dosen;
import javax.swing.JOptionPane;

/**
 *
 * @author MrKaisar
 */
public class PrintData {

    public PrintData() {
        
        String name = JOptionPane.showInputDialog("Masukkan Nama : ");
        
        Controller controller = new Controller();
        
        String data = controller.getData(name);
        
        JOptionPane.showMessageDialog(null, data);
        
        
    }
    
    

}
