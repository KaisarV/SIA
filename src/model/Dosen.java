
package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class Dosen extends Staff{
    private String departemen;
    private ArrayList<MatkulAjar> mataKuliahAjar = new ArrayList<MatkulAjar>();

    public Dosen(){}
    public Dosen(String departemen, String NIK, String nama, String alamat, String ttl, String telepon) {
        super(NIK, nama, alamat, ttl, telepon);
        this.departemen = departemen;
    }
    
    public Dosen(String departemen, String NIK) {
        super(NIK);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(ArrayList<MatkulAjar> mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }

    

    @Override
    public String toString() {
        return "Dosen{" + "departemen=" + departemen + ", mataKuliahAjar=" + mataKuliahAjar + '}';
    }
    
    
}
