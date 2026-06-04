import java.util.Scanner;

abstract class Pegawai {
    String nik, nama;
    int kehadiran;
    int gaji;

    Pegawai(String nik, String nama, int kehadiran, int gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    abstract int rekapGaji();

    void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Total Gaji : " + rekapGaji());
    }
}

class PegawaiKontrak extends Pegawai {
    int masaKontrak;

    PegawaiKontrak(String nik, String nama, int masaKontrak, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    int rekapGaji() {
        int uangMakan = 15000 * kehadiran;
        return gaji + uangMakan;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
    }
}

class PegawaiTetap extends Pegawai {
    final int tunjangan = 630000;

    PegawaiTetap(String nik, String nama, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, gaji);
    }

    @Override
    int rekapGaji() {
        int uangMakan = 15000 * kehadiran;
        return gaji + uangMakan + tunjangan;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan  : " + tunjangan);
    }
}

public class MainFila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pegawai p1, p2;

        System.out.println("=== INPUT PEGAWAI KONTRAK ===");
        System.out.print("NIK: ");
        String nik1 = input.nextLine();

        System.out.print("Nama: ");
        String nama1 = input.nextLine();

        System.out.print("Masa Kontrak: ");
        int masa = input.nextInt();

        System.out.print("Kehadiran: ");
        int hadir1 = input.nextInt();

        System.out.print("Gaji: ");
        int gaji1 = input.nextInt();

        p1 = new PegawaiKontrak(nik1, nama1, masa, hadir1, gaji1);

        input.nextLine();

        System.out.println("\n=== INPUT PEGAWAI TETAP ===");
        System.out.print("NIK: ");
        String nik2 = input.nextLine();

        System.out.print("Nama: ");
        String nama2 = input.nextLine();

        System.out.print("Kehadiran: ");
        int hadir2 = input.nextInt();

        System.out.print("Gaji: ");
        int gaji2 = input.nextInt();

        p2 = new PegawaiTetap(nik2, nama2, hadir2, gaji2);

        System.out.println("\n=== DATA PEGAWAI ===");
        p1.tampilData();

        System.out.println();

        p2.tampilData();

        input.close();
    }
}