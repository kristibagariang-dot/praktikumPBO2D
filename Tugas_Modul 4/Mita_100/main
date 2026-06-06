/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author param
 */
abstract class Pegawai {
     String NIK; 
     String nama;
     int kehadiran;
     int gaji;

    public Pegawai(String NIK, String nama, int kehadiran, int gaji) {
        this.NIK = NIK;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    public final int hitungUangMakan() {
        return kehadiran * 15000;
    }

    public abstract int rekapGaji();
    public abstract void tampilData(); 
}

class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    public PegawaiKontrak(String NIK, String nama, int masaKontrak, int kehadiran, int gaji) {
        super(NIK, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    public int rekapGaji() {
        return hitungUangMakan() + gaji;
    }

    @Override
    public void tampilData() {
        System.out.println("=== Pegawai Kontrak ===");
        System.out.println("NIK           : " + NIK);
        System.out.println("Nama          : " + nama);
        System.out.println("Masa Kontrak  : " + masaKontrak + " bulan");
        System.out.println("Kehadiran     : " + kehadiran);
        System.out.println("Uang Makan    : " + hitungUangMakan());
        System.out.println("Gaji Pokok    : " + gaji);
        System.out.println("Total Gaji    : " + rekapGaji());
        System.out.println();
    }
}

class PegawaiTetap extends Pegawai {
    private final int tunjangan = 630000;

    public PegawaiTetap(String NIK, String nama, int kehadiran, int gaji) {
        super(NIK, nama, kehadiran, gaji);
    }

    @Override
    public int rekapGaji() {
        return tunjangan + hitungUangMakan() + gaji;
    }

    @Override
    public void tampilData() {
        System.out.println("=== Pegawai Tetap ===");
        System.out.println("NIK           : " + NIK);
        System.out.println("Nama          : " + nama);
        System.out.println("Kehadiran     : " + kehadiran);
        System.out.println("Tunjangan     : " + tunjangan);
        System.out.println("Uang Makan    : " + hitungUangMakan());
        System.out.println("Gaji Pokok    : " + gaji);
        System.out.println("Total Gaji    : " + rekapGaji());
        System.out.println();
    }
}
final class Admin {
    private String namaAdmin;

    public Admin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public void tampilAdmin() {
        System.out.println("Admin: " + namaAdmin);
    }
}


public class main {
    public static void main(String[] args) {

        Pegawai p1 = new PegawaiKontrak("KRKN.148501", "Xiumin", 12, 29, 3500000);
        Pegawai p2 = new PegawaiTetap("KRTP.148599", "Paramita", 29, 5600000);
        
        Admin admin = new Admin("Budi");
        
        p1.tampilData();
        p2.tampilData();
        admin.tampilAdmin();
    }
}
