/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class PegawaiT4 {

    // 🔹 Abstract Class (Abstraction)
    static abstract class Pegawai {
        protected String nik;
        protected String nama;
        protected int kehadiran;
        protected double gaji;

        public Pegawai(String nik, String nama, int kehadiran, double gaji) {
            this.nik = nik;
            this.nama = nama;
            this.kehadiran = kehadiran;
            this.gaji = gaji;
        }

        // Method abstract
        public abstract double rekapGaji();

        // 🔹 Method final (tidak bisa dioverride)
        public final void tampilData() {
            System.out.println("NIK        : " + nik);
            System.out.println("Nama       : " + nama);
            System.out.println("Kehadiran  : " + kehadiran + " hari");
            System.out.println("Gaji Bersih: " + rekapGaji());
            System.out.println("---------------------------");
        }
    }

    // 🔹 Class PegawaiKontrak
    static class PegawaiKontrak extends Pegawai {
        private int masaKontrak;
        private double uangMakan;

        public PegawaiKontrak(String nik, String nama, int masaKontrak, int kehadiran, double gaji) {
            super(nik, nama, kehadiran, gaji);
            this.masaKontrak = masaKontrak;
            this.uangMakan = 15000 * kehadiran;
        }

        @Override
        public double rekapGaji() {
            return gaji + uangMakan;
        }

        public void infoTambahan() {
            System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
            System.out.println("Uang Makan   : " + uangMakan);
            System.out.println("---------------------------");
        }
    }

    // 🔹 Class PegawaiTetap
    static class PegawaiTetap extends Pegawai {
        private double tunjangan;
        private double uangMakan;

        public PegawaiTetap(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran, gaji);
            this.tunjangan = 630000;
            this.uangMakan = 15000 * kehadiran;
        }

        @Override
        public double rekapGaji() {
            return gaji + tunjangan + uangMakan;
        }

        public void infoTambahan() {
            System.out.println("Tunjangan   : " + tunjangan);
            System.out.println("Uang Makan  : " + uangMakan);
            System.out.println("---------------------------");
        }
    }

    // 🔹 Final Class (tidak bisa diturunkan)
    final static class DataPerusahaan {
        public void info() {
            System.out.println("Perusahaan : PT Maju Jaya Abadi");
            System.out.println("===============================");
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        DataPerusahaan dp = new DataPerusahaan();
        dp.info();

        PegawaiKontrak p1 = new PegawaiKontrak("K001", "Andi", 12, 20, 3000000);
        PegawaiTetap p2 = new PegawaiTetap("T001", "Nurul Qomariyah", 20, 4000000);

        System.out.println("=== Pegawai Kontrak ===");
        p1.tampilData();
        p1.infoTambahan();

        System.out.println("=== Pegawai Tetap ===");
        p2.tampilData();
        p2.infoTambahan();
    }
}