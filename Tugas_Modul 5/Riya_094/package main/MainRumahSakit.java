/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import pasien.RawatInap;
import dookter.Dokter;
import dookter.JadwalDokter;

public class MainRumahSakit {

    public static void main(String[] args) {

        Login log = new Login();
        log.masuk();
        System.out.println("====================");
        RawatInap pasien1 =
                new RawatInap("Budi", 20, "Demam", 101);
        pasien1.tampilRawatInap();

        System.out.println("====================");

        Dokter dokter1 =
                new Dokter("Qomariyah", "Anak");

        dokter1.tampilDokter();

        System.out.println("====================");

        JadwalDokter jadwal =
                new JadwalDokter();

        jadwal.tampilJadwal();
    }
}