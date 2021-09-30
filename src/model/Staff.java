
package model;

/**
 *
 * @author MrKaisar
 */
public class Staff extends User{
    private String NIK;
    
    public Staff(){}
    public Staff(String NIK) {
        this.NIK = NIK;
    }

    public Staff(String NIK, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Staff{" + "NIK=" + NIK + '}';
    }
    
    
    
}
