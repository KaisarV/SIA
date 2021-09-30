package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class Magister extends Mahasiswa {

    private ArrayList<MatkulAmbil> mataKuliahAmbil = new ArrayList<MatkulAmbil>();
    private String judulTesis;

    public Magister() {
    }

    public Magister(String nim, String jurusan, String nama, String alamat, String ttl, String telepon, String judulTesis) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulTesis = judulTesis;
    }

    public ArrayList<MatkulAmbil> getMataKuliahAmbil() {
        return mataKuliahAmbil;
    }

    public void setMataKuliahAmbil(ArrayList<MatkulAmbil> mataKuliahAmbil) {
        this.mataKuliahAmbil = mataKuliahAmbil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "Magister{" + "mataKuliah=" + mataKuliahAmbil + ", judulTesis=" + judulTesis + '}';
    }

}
