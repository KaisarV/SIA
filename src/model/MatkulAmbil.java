
package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class MatkulAmbil{
    
    private MataKuliah matkulAmbil;
    private ArrayList<HadirEnum> listPresensi = new ArrayList<HadirEnum>();
    int n1, n2, n3;
    
    public MatkulAmbil(){}

    public MatkulAmbil(int n1, int n2, int n3, MataKuliah matkulAmbil) {
        
        this.matkulAmbil = matkulAmbil;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public MatkulAmbil(int n1, int n2, int n3, MataKuliah matkulAmbil, ArrayList<HadirEnum> listPresensi) {
        
        this.matkulAmbil = matkulAmbil;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.listPresensi = listPresensi;
    }

    public MataKuliah getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(MataKuliah matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<HadirEnum> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<HadirEnum> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public MatkulAmbil(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil{" + "matkulAmbil=" + matkulAmbil + ", listPresensi=" + listPresensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }

    
    
    
    
    
    
    
    
}
