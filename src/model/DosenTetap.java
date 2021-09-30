/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author MrKaisar
 */
public class DosenTetap extends Dosen{
    
    private int salary;
    
    public DosenTetap(){}
    
    public DosenTetap(int salary) {
        this.salary = salary;
    }

    public DosenTetap(int salary, String departemen, String NIK) {
        super(departemen, NIK);
        this.salary = salary;
    }

    public DosenTetap(int salary, String departemen, String NIK, String nama, String alamat, String ttl, String telepon) {
        super(departemen, NIK, nama, alamat, ttl, telepon);
        this.salary = salary;
    }
    
    //Getter Setter

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() + "DosenTetap{" + "salary=" + salary + '}';
    }
    
    
}
