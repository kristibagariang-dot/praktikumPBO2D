/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dookter;

public class Dokter {

    protected String namaDokter;

    private String spesialis;

    public Dokter(String namaDokter, String spesialis) {
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    public void tampilDokter() {
        System.out.println("Nama Dokter : " + namaDokter);
        System.out.println("Spesialis : " + spesialis);
    }
}