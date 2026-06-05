abstract class Pegawai {
    protected String nik;
    protected String nama;
    protected int kehadiran;
    protected int gaji;

    public void setData(String nik, String nama, int kehadiran, int gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    // Method abstrak (abstraction)
    public abstract int rekapGaji();

    // Method final (tidak dapat dioverride)
    public final void infoPerusahaan() {
        System.out.println("Perusahaan : PT Maju Sejahtera");
    }

    public abstract void tampilData();
}

class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    int uangMakan;

    PegawaiKontrak(String nik, String nama, int kehadiran,
                   int gaji, int masaKontrak) {
        super.setData(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    public int rekapGaji() {
        uangMakan = 15000 * kehadiran;
        return uangMakan + gaji;
    }

    @Override
    public void tampilData() {
        infoPerusahaan();
        System.out.println("=== Data Pegawai Kontrak ===");
        System.out.println("NIK           : " + nik);
        System.out.println("Nama          : " + nama);
        System.out.println("Kehadiran     : " + kehadiran);
        System.out.println("Masa Kontrak  : " + masaKontrak + " bulan");
        System.out.println("Gaji Bersih   : " + rekapGaji());
    }
}

class PegawaiTetap extends Pegawai {
    int tunjangan = 630000;
    int uangMakan;

    PegawaiTetap(String nik, String nama,
                 int kehadiran, int gaji) {
        super.setData(nik, nama, kehadiran, gaji);
    }

    @Override
    public int rekapGaji() {
        uangMakan = 15000 * kehadiran;
        return tunjangan + uangMakan + gaji;
    }

    @Override
    public void tampilData() {
        infoPerusahaan();
        System.out.println("=== Data Pegawai Tetap ===");
        System.out.println("NIK           : " + nik);
        System.out.println("Nama          : " + nama);
        System.out.println("Kehadiran     : " + kehadiran);
        System.out.println("Tunjangan     : " + tunjangan);
        System.out.println("Gaji Bersih   : " + rekapGaji());
    }
}

// Class final (tidak dapat diturunkan)
final class HRD {
    public void cetakPesan() {
        System.out.println("HRD: Data pegawai telah diverifikasi.");
    }
}

public class Latihan {
    public static void main(String[] args) {

        Pegawai p;

        p = new PegawaiKontrak("001", "Budi", 20, 3000000, 6);
        p.tampilData();
        System.out.println();

        p = new PegawaiTetap("002", "Andi", 22, 4000000);
        p.tampilData();
        System.out.println();

        HRD hrd = new HRD();
        hrd.cetakPesan();
    }
}
