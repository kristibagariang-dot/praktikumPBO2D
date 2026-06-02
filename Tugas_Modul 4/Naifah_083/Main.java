import java.util.Scanner;

abstract class Pegawai {
    String nik, nama;
    int kehadiran;
    double gaji;

    double uangMakan() {
        return 15000 * kehadiran;
    }

    abstract double rekapGaji();

    void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji Pokok : " + gaji);
    }
}

class PegawaiKontrak extends Pegawai {
    int masaKontrak;

    @Override
    double rekapGaji() {
        return uangMakan() + gaji;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
        System.out.println("Total Gaji   : " + rekapGaji());
    }
}

class PegawaiTetap extends Pegawai {
    double tunjangan = 630000;

    @Override
    double rekapGaji() {
        return tunjangan + uangMakan() + gaji;
    }
}

public class Main {
    public static void main(String[] args) {
        PegawaiKontrak pk = new PegawaiKontrak();
        pk.nik = "083";
        pk.nama = "Naifah";
        pk.kehadiran = 20;
        pk.gaji = 2000000;
        pk.masaKontrak = 6;

        pk.tampilData();
    }
}
