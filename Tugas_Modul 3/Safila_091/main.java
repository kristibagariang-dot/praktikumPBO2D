import java.util.Scanner;

// Superclass
class Pegawai {
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

    public double rekapGaji() {
        return 0;
    }

    public void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji Pokok : Rp" + gaji);
    }
}

// Subclass Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
