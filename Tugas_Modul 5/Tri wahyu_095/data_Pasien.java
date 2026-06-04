package data;

public class Pasien {

    public String nama;
    protected int umur;
    public final String kodePasien = "PSN001";

    // Constructor
    public Pasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilPasien() {
        System.out.println("=== DATA PASIEN ===");
        System.out.println("Kode Pasien : " + kodePasien);
        System.out.println("Nama        : " + nama);
        System.out.println("Umur        : " + umur);
    }
}
