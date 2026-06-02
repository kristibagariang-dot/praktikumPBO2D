/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

// public modifier
public class Pasien {

    // protected modifier
    protected String nama;

    // private modifier
    private int umur;

    // default modifier
    String penyakit;

    // final modifier
    final String rumahSakit = "RS Sehat Sentosa";

    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    // public method
    public void tampilPasien() {
        System.out.println("Rumah Sakit : " + rumahSakit);
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur Pasien : " + umur);
        System.out.println("Penyakit : " + penyakit);
    }

    // private method
    private void dataRahasia() {
        System.out.println("Data pasien bersifat rahasia");
    }

    public void tampilRahasia() {
        dataRahasia();
    }
}