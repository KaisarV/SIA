
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author hanschristian
 */
public class MainMenuScreen {
    
    public MainMenuScreen() {
        showMainMenu();
    }
    
    private void showMainMenu() {
        Boolean menu = true;
        while(menu) {
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Input Menu: "
                            + "\n1. Print Data User"
                            + "\n2. Hitung Nilai Akhir "
                            + "\n3. Hitung Nilai Rata Rata Akhir Seluruh MK "
                            + "\n4. Hitung Jumlah Mahasiswa Tidak Lulus MK"
                            + "\n5. Data Matkul berdasarkan NIM"
                            + "\n6. Jam Dosen"
                            + "\n7. Gaji Seorang Staff"
                            + "\n8. Exit"));
            switch(pilihan) {
                case 1: 
                    new PrintData();
                    break;
                case 2: 
                    new NilaiAkhir();  
                    break;
                case 3: 
                    new MeanMK();
                    break;
                case 4:
                    new PrintTidakLulusMK();
                    break;
                case 5:
                    new DataMatkulPerMhs();
                    break;
                case 6:
                    new JamAjarDosen();
                    break;
                case 7:
                    new ScreenGaji();
                    break;
                case 8:
                    menu = false;
                    break;
            }
        }
    }
}
