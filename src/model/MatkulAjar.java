
package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class MatkulAjar{
    
    private MataKuliah matkulDiajar;
    private ArrayList<HadirEnum> listPresensi = new ArrayList<HadirEnum>();
    
    public MatkulAjar() {
    }

    public MatkulAjar(MataKuliah matkulDiajar, ArrayList<HadirEnum> listPresensi) {
        this.matkulDiajar = matkulDiajar;
        this.listPresensi = listPresensi;
    }
    
    public MataKuliah getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(MataKuliah matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public ArrayList<HadirEnum> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<HadirEnum> listPresensi) {
        this.listPresensi = listPresensi;
    }
    
    @Override
    public String toString() {
        return super.toString() + "MatkulAjar{" + '}';
    }
    
    
    
}
