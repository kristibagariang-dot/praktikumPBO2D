/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author param
 */
public class kendaraan {
    public String merk;
    protected int tahun;

    public kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }
    
    public void tampilKendaraan(){
        System.out.println("Merk Kendaraan : " + merk);
        System.out.println("Tahun Kendaraan : " + tahun);
    }
        
}
