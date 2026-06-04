 import java.util.Scanner;

abstract class Pegawai1 {
    protected String nik, nama;
    protected int kehadiran;
    protected double gaji, uangMakan;

    public Pegawai1(String nik, String nama, int kehadiran, double gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
        this.uangMakan = 15000 * kehadiran;
    }

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

class PegawaiKontrak extends Pegawai1 {
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

class PegawaiTetap extends Pegawai1 {
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


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pegawai1[] data = new Pegawai1[2];

        data[0] = new PegawaiKontrak("K001", "Tri wahyu", 6, 20, 2000000);
        data[1] = new PegawaiTetap("T001", "Yuya", 22, 3000000);

        for (Pegawai1 p : data) {
            p.tampilData();
        }
    }
}1
