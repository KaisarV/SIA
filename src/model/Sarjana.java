
package model;
import java.util.ArrayList;
/**
 *
 * @author MrKaisar
 */
public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> mataKuliahAmbil = new ArrayList<MatkulAmbil>();

    public Sarjana() {
    }

    public Sarjana(String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
    }
    
    public ArrayList<MatkulAmbil> getMataKuliahAmbil() {
        return mataKuliahAmbil;
    }

    public void setMataKuliahAmbil(ArrayList<MatkulAmbil> mataKuliahAmbil) {
        this.mataKuliahAmbil = mataKuliahAmbil;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Sarjana{" + "mataKuliah=" + mataKuliahAmbil + '}';
    }

    

    
    
}
