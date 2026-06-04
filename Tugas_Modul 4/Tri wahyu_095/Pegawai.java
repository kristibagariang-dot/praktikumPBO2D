import java.util.Scanner;

abstract class Pegawai {
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

    abstract double rekapGaji();
    abstract void tampilData();
}

final class Perusahaan {
    private String namaPerusahaan;

    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public final void tampilInfoPerusahaan() {
        System.out.println("Perusahaan : " + namaPerusahaan);
    }
}

class PegawaiKontrak extends Pegawai {
    private int masaKontrak;
    private double uangMakan;

    public PegawaiKontrak(String nik, String nama, int masaKontrak,
                           int kehadiran, double gaji) {
        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
        this.uangMakan = kehadiran * 15000;
    }

    @Override
    double rekapGaji() {
        return gaji + uangMakan;
    }

    @Override
    void tampilData() {
        System.out.println("=== Data Pegawai Kontrak ===");
        System.out.println("NIK            : " + nik);
        System.out.println("Nama           : " + nama);
        System.out.println("Masa Kontrak   : " + masaKontrak + " bulan");
        System.out.println("Kehadiran      : " + kehadiran + " hari");
        System.out.println("Gaji Pokok     : " + gaji);
        System.out.println("Uang Makan     : " + uangMakan);
        System.out.println("Total Gaji     : " + rekapGaji());
    }
}

class PegawaiTetap extends Pegawai {
    private double tunjangan;
    private double uangMakan;

    public PegawaiTetap(String nik, String nama,
                        int kehadiran, double gaji) {
        super(nik, nama, kehadiran, gaji);
        this.tunjangan = 630000;
        this.uangMakan = kehadiran * 15000;
    }

    @Override
    double rekapGaji() {
        return gaji + tunjangan + uangMakan;
    }

    @Override
    void tampilData() {
        System.out.println("=== Data Pegawai Tetap ===");
        System.out.println("NIK            : " + nik);
        System.out.println("Nama           : " + nama);
        System.out.println("Kehadiran      : " + kehadiran + " hari");
        System.out.println("Gaji Pokok     : " + gaji);
        System.out.println("Tunjangan      : " + tunjangan);
        System.out.println("Uang Makan     : " + uangMakan);
        System.out.println("Total Gaji     : " + rekapGaji());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Perusahaan perusahaan = new Perusahaan("PT Makanan cepat saji");
        perusahaan.tampilInfoPerusahaan();

        System.out.println("\nPilih Jenis Pegawai");
        System.out.println("1. Pegawai Kontrak");
        System.out.println("2. Pegawai Tetap");
        System.out.print("Masukkan pilihan: ");
        int pilih = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kehadiran: ");
        int hadir = input.nextInt();

        System.out.print("Masukkan Gaji Pokok: ");
        double gaji = input.nextDouble();

        Pegawai pegawai;

        if (pilih == 1) {
            System.out.print("Masukkan Masa Kontrak (bulan): ");
            int masaKontrak = input.nextInt();

            pegawai = new PegawaiKontrak(nik, nama, masaKontrak, hadir, gaji);
        } else {
            pegawai = new PegawaiTetap(nik, nama, hadir, gaji);
        }

        System.out.println();
        pegawai.tampilData();

        input.close();
    }
}
