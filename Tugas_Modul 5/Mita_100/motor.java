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
public class motor extends kendaraan {
    public String jenis;

    public motor(String merk, int tahun, String jenis){
        super(merk, tahun);
        this.jenis = jenis;
    }

    public void tampilMotor(){
        System.out.println("Merk : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("Jenis Motor : " + jenis);
    }
}
