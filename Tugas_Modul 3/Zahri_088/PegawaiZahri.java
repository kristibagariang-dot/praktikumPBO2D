abstract class DataPegawaiZahri {
    String nik, nama;
    int kehadiran;
    double gajiPokok;
    double uangMakanPerHari = 15000;

    public DataPegawaiZahri(String nik, String nama, int kehadiran, double gajiPokok) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gajiPokok = gajiPokok;
    }

    // 1. METHOD YANG TIDAK DAPAT DI-OVERRIDE (Final Method)
    public final double hitungUangMakan() {
        return kehadiran * uangMakanPerHari;
    }

    public abstract double rekapGaji();
    public abstract void tampilData();
}

class KontrakZahri extends DataPegawaiZahri {
    int masaKontrak;

    public KontrakZahri(String nik, String nama, int masa, int hadir, double gaji) {
        super(nik, nama, hadir, gaji);
        this.masaKontrak = masa;
    }

    @Override
    public double rekapGaji() {
        return gajiPokok + hitungUangMakan();
    }

    @Override
    public void tampilData() {
        System.out.println("DATA PEGAWAI KONTRAK");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
        System.out.println("Kehadiran    : " + kehadiran + " hari");
        System.out.println("TOTAL GAJI   : Rp " + rekapGaji());
    }
}

// 2. CLASS YANG TIDAK DAPAT DITURUNKAN (Final Class)
final class TetapZahri extends DataPegawaiZahri {
    double tunjangan = 630000;

    public TetapZahri(String nik, String nama, int hadir, double gaji) {
        super(nik, nama, hadir, gaji);
    }

    @Override
    public double rekapGaji() {
        return gajiPokok + tunjangan + hitungUangMakan();
    }

    @Override
    public void tampilData() {
        System.out.println("DATA PEGAWAI TETAP");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Kehadiran    : " + kehadiran + " hari");
        System.out.println("TOTAL GAJI   : Rp " + rekapGaji());
    }
}

public class PegawaiZahri {
    public static void main(String[] args) {
        DataPegawaiZahri p1 = new KontrakZahri("088", "Muhammad Zahri", 12, 26, 2800000);
        DataPegawaiZahri p2 = new TetapZahri("089", "Zahri Ramadani", 26, 3500000);
        
        p1.tampilData();
        System.out.println(); 
        p2.tampilData();
    }
}
