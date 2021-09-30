/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MrKaisar
 */
public class PresensiStaff extends Presensi{
    
    private int jam;
    
    public PresensiStaff(){}
    
    public PresensiStaff(int jam) {
        this.jam = jam;
    }

    public PresensiStaff(int jam, int tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    

    @Override
    public String toString() {
        return "PresensiStaff{" + "jam=" + jam + '}';
    }

}
