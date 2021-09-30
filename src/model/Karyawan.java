
package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class Karyawan extends Staff{
    private int salary;
    private ArrayList<HadirEnum> listPresensiStaff = new ArrayList<HadirEnum>();
    
    public Karyawan(){}
    
    public Karyawan(int salary) {
        this.salary = salary;
    }

    public Karyawan(int salary, String NIK) {
        super(NIK);
        this.salary = salary;
    }

    public Karyawan(int salary, String NIK, String nama, String alamat, String ttl, String telepon, ArrayList<HadirEnum> listPresensiStaff) {
        super(NIK, nama, alamat, ttl, telepon);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }
    
    //getter setter

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<HadirEnum> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<HadirEnum> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "Karyawan{" + "salary=" + salary + ", listPresensiStaff=" + listPresensiStaff + '}';
    }
    
    
}
