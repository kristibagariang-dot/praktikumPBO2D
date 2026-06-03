package naifah;

import pasien.Pasien;
import pasien.RawatInap;
import dokter.Dokter;
import dokter.JadwalDokter;

public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("Selamat Datang Di RS Sehat Selalu");
        System.out.println("=======================================");

        RumahSakit rs = new RumahSakit();

        Pasien p1 = new Pasien("Budi", 18);
        RawatInap r1 = new RawatInap("VIP");

        Dokter d1 = new Dokter("Dr. Naifah", "Umum");
        JadwalDokter j1 = new JadwalDokter("Senin - Selasa");

        rs.tampilRumahSakit();

        System.out.println();

        p1.tampilPasien();

        System.out.println();

        r1.tampilKamar();

        System.out.println();

        d1.tampilDokter();

        System.out.println();

        j1.tampilJadwal();

        System.out.println();
        System.out.println("======================================");
        System.out.println("Terima Kasih Telah Menggunakan");
        System.out.println("Layanan RS Sehat Selalu");
        System.out.println("Semoga Lekas Sembuh :)");
        System.out.println("======================================");
    }
}