class Pegawai {
    String NIK, nama;
    int kehadiran;
    double gaji;

    public Pegawai(String NIK, String nama, int kehadiran, double gaji) {
        this.NIK = NIK;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    double rekapGaji() {
        return 0; // akan dioverride
    }

    void tampilData() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + nama);
        System.out.println("Kehadiran: " + kehadiran);
        System.out.println("Gaji Pokok: " + gaji);
    }
}
class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    double uangMakan;

    public PegawaiKontrak(String NIK, String nama, int masaKontrak, int kehadiran, double gaji) {
        super(NIK, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    double rekapGaji() {
        return uangMakan + gaji;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Masa Kontrak: " + masaKontrak);
        System.out.println("Uang Makan: " + uangMakan);
        System.out.println("Total Gaji: " + rekapGaji());
    }
}
class PegawaiTetap extends Pegawai {
    double tunjangan = 630000;
    double uangMakan;

    public PegawaiTetap(String NIK, String nama, int kehadiran, double gaji) {
        super(NIK, nama, kehadiran, gaji);
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    double rekapGaji() {
        return tunjangan + uangMakan + gaji;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Uang Makan: " + uangMakan);
        System.out.println("Total Gaji: " + rekapGaji());
    }
}
public class Main {
    public static void main(String[] args) {
        
        Pegawai p1 = new PegawaiKontrak("K001", "Andi", 6, 20, 2000000);
        Pegawai p2 = new PegawaiTetap("T001", "Budi", 22, 3000000);

        System.out.println("=== Pegawai Kontrak ===");
        p1.tampilData();

        System.out.println("\n=== Pegawai Tetap ===");
        p2.tampilData();
    }
}
