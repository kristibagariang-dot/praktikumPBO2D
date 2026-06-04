/*@author Taufiq*/
abstract class Pegawai {
    String nik;
    String nama;
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
        System.out.println("Kehadiran  : " + kehadiran + " hari");
    }

    final void infoPerusahaan() {
        System.out.println("Perusahaan : PT Maju Indonesia");
    }
}

class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    int uangMakan;

    PegawaiKontrak(String nik, String nama, int kehadiran, int gaji, int masaKontrak) {
        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    int rekapGaji() {
        return gaji + uangMakan;
    }

    @Override
    void tampilData() {
        super.tampilData();
        infoPerusahaan();
        System.out.println("Status     : Kontrak (" + masaKontrak + " bulan)");
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + rekapGaji());
        System.out.println("----------------------------");
    }
}

// ================= Pegawai Tetap =================
class PegawaiTetap extends Pegawai {
    int tunjangan;
    int uangMakan;

    PegawaiTetap(String nik, String nama, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, gaji);
        this.tunjangan = 630000;
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    int rekapGaji() {
        return gaji + tunjangan + uangMakan;
    }

    @Override
    void tampilData() {
        super.tampilData();
        infoPerusahaan();
        System.out.println("Status     : Tetap");
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + rekapGaji());
        System.out.println("----------------------------");
    }
}

final class Admin {
    void tampilAdmin() {
        System.out.println("Admin tidak bisa diturunkan (final class)");
    }
}

public class Main {
    public static void main(String[] args) {

        Pegawai p1 = new PegawaiKontrak("35207311B90",
                "Mahsunatul", 21, 2000000, 12);

        Pegawai p2 = new PegawaiTetap("2506711005",
                "Umamah", 20, 3000000);

        p1.tampilData();
        p2.tampilData();

        Admin admin = new Admin();
        admin.tampilAdmin();
    }
}
