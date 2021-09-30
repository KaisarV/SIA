
package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class DosenHonorer extends Dosen{
    
    private int honorPerSKS;
    
    public DosenHonorer(){}

    public DosenHonorer(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public DosenHonorer(int honorPerSKS, String departemen, String NIK) {
        super(departemen, NIK);
        this.honorPerSKS = honorPerSKS;
    }

    public DosenHonorer(int honorPerSKS, String departemen, String NIK, String nama, String alamat, String ttl, String telepon) {
        super(departemen, NIK, nama, alamat, ttl, telepon);
        this.honorPerSKS = honorPerSKS;
    }
    
    //Getter Setter

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    
    @Override
    public String toString() {
        return super.toString() +"DosenHonorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }
    
  
    
}
