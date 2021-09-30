
package model;

/**
 *
 * @author MrKaisar
 */
public class Mahasiswa extends User{
    
    private String nim;
    private String jurusan;
    
    public Mahasiswa(){}
    
    public Mahasiswa(String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "Mahasiswa{" + "nim=" + nim + ", jurusan=" + jurusan + '}';
    }

    
    
}
