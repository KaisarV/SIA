
package model;

/**
 *
 * @author MrKaisar
 */
public class MatkulPilihan extends MataKuliah {

    private int jumlahMinimumMahasiswa;

    public MatkulPilihan() {
    }

    public MatkulPilihan(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    public MatkulPilihan(int jumlahMinimumMahasiswa, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    public MatkulPilihan(String kode, int sks, String nama) {
        super(kode, sks, nama);
    }

    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }

    public void setJumlahMinimumMahasiswa(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "MatkulPilihan{" + "jumlahMinimumMahasiswa=" + jumlahMinimumMahasiswa + '}';
    }
    
    

}
