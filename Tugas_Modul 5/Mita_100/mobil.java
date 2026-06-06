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
public final class mobil extends kendaraan {
    public int pintu;
    
    public mobil(String merk, int tahun, int pintu){
        super(merk, tahun);
        this.pintu = pintu;
    }
    public void tampilmobil(){
        System.out.println("Merk : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("Jumlah Pintu : " + pintu);
    }
}