import java.util.Scanner;
// Superclass
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
    // Polymorphism (abstract method)
    abstract double hitungGaji();
    public void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}
// Subclass Kontrak
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    public PegawaiKontrak(String nik, String nama, int masaKontrak, int kehadiran, double gaji) {
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
        System.out.println("Masa Kontrak: " + masaKontrak + " bulan");
    }
}
// Subclass Tetap
class PegawaiTetap extends Pegawai {
    private final double tunjangan = 630000;
    public PegawaiTetap(String nik, String nama, int kehadiran, double gaji) {
        super(nik, nama, kehadiran, gaji);
    }

    @Override
    double hitungGaji() {
        return tunjangan + uangMakan + gaji;
    }
    @Override
    public void tampilData() {
        System.out.println("\n=== Pegawai Tetap ===");
        super.tampilData();
        System.out.println("Tunjangan  : " + tunjangan);
    }
}
// Main
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai[] data = new Pegawai[2]; // contoh 2 pegawai
        // Polymorphism
        data[0] = new PegawaiKontrak("12345", "fafa", 6, 20, 2000000);
        data[1] = new PegawaiTetap("67890", "fufu", 22, 3000000);
        for (Pegawai p : data) {
            p.tampilData(); // polymorphism terjadi di sini
        }
    }
}
