import java.util.Scanner;

// Abstract Class Pegawai
abstract class Pegawai {
    protected String nik, nama;
    protected int kehadiran;
    protected double gaji, uangMakan;

    public Pegawai(String nik, String nama, int kehadiran, double gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
        this.uangMakan = 15000 * kehadiran;
    }

    // Method abstract
    abstract double hitungGaji();

    // Method final
    public final void infoPerusahaan() {
        System.out.println("Perusahaan: PT Maju Jaya");
    }

    public void tampilData() {
        infoPerusahaan();
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}

// Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    public PegawaiKontrak(String nik, String nama,
                          int masaKontrak,
                          int kehadiran,
                          double gaji) {

        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    double hitungGaji() {
        return uangMakan + gaji;
    }

    @Override
    public void tampilData() {
        System.out.println("\n=== Pegawai Kontrak ===");
        super.tampilData();
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
    }
}

// Pegawai Tetap
class PegawaiTetap extends Pegawai {

    private final double tunjangan = 630000;

    public PegawaiTetap(String nik,
                        String nama,
                        int kehadiran,
                        double gaji) {

        super(nik, nama, kehadiran, gaji);
    }

    @Override
    double hitungGaji() {
        return uangMakan + gaji + tunjangan;
    }

    @Override
    public void tampilData() {
        System.out.println("\n=== Pegawai Tetap ===");
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}

// Class Admin
final class Admin {
    public void akses() {
        System.out.println("Admin mengakses sistem.");
    }
}

// Main Class
public class Modul4 {
    public static void main(String[] args) {

        Pegawai[] data = new Pegawai[2];

        data[0] = new PegawaiKontrak(
                "12345",
                "fafa",
                6,
                20,
                2000000);

        data[1] = new PegawaiTetap(
                "67890",
                "fufu",
                22,
                3000000);

        for (Pegawai p : data) {
            p.tampilData();
        }

        // Admin
        Admin admin = new Admin();
        admin.akses();
    }
}
