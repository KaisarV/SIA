package view;

import Controller.*;
import model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MrKaisar
 */
public class NilaiAkhir {

    public NilaiAkhir() {

        Controller controller = new Controller();
        boolean check;
        MatkulAmbil data = new MatkulAmbil();
        do {
            check = false;
            String nim = JOptionPane.showInputDialog("Masukkan NIM : ");
            
            Mahasiswa dataMahasiswa = new Mahasiswa();
            //Get data mahasiswa

            dataMahasiswa = controller.cekStatus(nim);

            if (!"Doktor".equals(dataMahasiswa.getClass().getSimpleName())) {
                String kodeMK = JOptionPane.showInputDialog("Masukkan MK: ");
                if (dataMahasiswa.getNama() == null) {
                    JOptionPane.showMessageDialog(null, "NIM mahasiswa tidak ditemukan", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    check = true;
                } else {
                    //Get MataKuliah Ambil
                    data = controller.getMatkulAmbilByKodeMK(kodeMK, dataMahasiswa);
                    check = false;
                }
            }

            if (data == null) {
                JOptionPane.showMessageDialog(null, "Kode MK dari mahasiswa tidak ditemukan !", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                check = true;
            }

            if (check == false) {
                if (!"Doktor".equals(dataMahasiswa.getClass().getSimpleName())) {
                    //Count Nilai
                    int n1 = data.getN1();
                    int n2 = data.getN2();
                    int n3 = data.getN3();

                    double total = controller.countMean(n1, n2, n3);

                    JOptionPane.showMessageDialog(null, "Nilai akhir " + dataMahasiswa.getNama() + " pada mata kuliah "
                            + data.getMatkulAmbil().getNama() + " adalah " + total);
                } else {
                    Doktor p = (Doktor) dataMahasiswa;

                    int n1 = p.getNilaiSidang1();
                    int n2 = p.getNilaiSidang2();
                    int n3 = p.getNilaiSidang3();

                    double total = controller.countMean(n1, n2, n3);

                    JOptionPane.showMessageDialog(null, "Nilai akhir " + dataMahasiswa.getNama() + " adalah " + total);
                }
                check = false;

            }
        } while (check == true);

    }

}
