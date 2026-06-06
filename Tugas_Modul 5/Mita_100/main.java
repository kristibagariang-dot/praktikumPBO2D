/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import anggota.*;
import kendaraan.*;
/**
 *
 * @author param
 */
public class main {
    public static void main(String args[]){
       rumah rumah1 = new rumah(26, "Sidoarjo", new keluarga(5, "melisa"));
        System.out.println(rumah1.norumah + "\n" + rumah1.alamat + "\n" + rumah1.satu.nama + "\n" + rumah1.satu.jml);
        
        // contoh pengambilan class beda package 
        orang org = new orang("Sehun", 11);
        System.out.println("\n" + org.getnama());
        
        // contoh pengambilan class beda package 
        mahasiswa mhs = new mahasiswa("Lylia", 12, "25123456990", "Bahasa Indonesia");
        System.out.println("\n" + mhs.cetak2()); 
        
        mobil m1 = new mobil("BMW", 2022, 2);
        m1.tampilmobil();

        System.out.println();
        // object motor
        motor m2 = new motor("Suzuki", 2021, "Matic");
        m2.tampilMotor();
    }
}
