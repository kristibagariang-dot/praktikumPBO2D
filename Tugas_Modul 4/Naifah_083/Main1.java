package pbo;

import java.util.Scanner;

class Pegawai {
    String nik, nama;
    int kehadiran;
    double gaji;

    
    final double uangMakan() {
        return 15000 * kehadiran;
    }

    double rekapGaji() {
        return 0;
    }

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
        System.out.println("Uang Makan   : " + uangMakan());
        System.out.println("Total Gaji   : " + rekapGaji());
        System.out.println("---------------------------");
    }
}

// Final Class
final class PegawaiTetap extends Pegawai {
    final double tunjangan = 630000;

    @Override
    double rekapGaji() {
        return tunjangan + uangMakan() + gaji;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Uang Makan  : " + uangMakan());
        System.out.println("Total Gaji  : " + rekapGaji());
        System.out.println("---------------------------");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PegawaiKontrak pk = new PegawaiKontrak();
        System.out.println("=== Input Pegawai Kontrak ===");
        System.out.print("NIK          : ");
        pk.nik = input.nextLine();
        System.out.print("Nama         : ");
        pk.nama = input.nextLine();
        System.out.print("Masa Kontrak : ");
        pk.masaKontrak = input.nextInt();
        System.out.print("Kehadiran    : ");
        pk.kehadiran = input.nextInt();
        System.out.print("Gaji Pokok   : ");
        pk.gaji = input.nextDouble();

        input.nextLine();

        PegawaiTetap pt = new PegawaiTetap();
        System.out.println("\n=== Input Pegawai Tetap ===");
        System.out.print("NIK        : ");
        pt.nik = input.nextLine();
        System.out.print("Nama       : ");
        pt.nama = input.nextLine();
        System.out.print("Kehadiran  : ");
        pt.kehadiran = input.nextInt();
        System.out.print("Gaji Pokok : ");
        pt.gaji = input.nextDouble();

        System.out.println("\n=== Data Pegawai ===");
        pk.tampilData();
        pt.tampilData();

        input.close();
    }
}
