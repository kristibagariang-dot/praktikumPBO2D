// Class Induk
class Pegawai {
    String NIK;
    String nama;
    int kehadiran;
    double gaji;
    double uangMakan;

    void rekapGaji() {
        // Akan dioverride di class turunan
    }

    void tampilData() {
        System.out.println("NIK        : " + NIK);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran + " hari");
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Gaji Pokok : " + gaji);
    }
}

// Class Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    double totalGaji;

    PegawaiKontrak(String NIK, String nama, int masaKontrak, int kehadiran, double gaji) {
        this.NIK = NIK;
        this.nama = nama;
        this.masaKontrak = masaKontrak;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    void rekapGaji() {
        totalGaji = uangMakan + gaji;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
        System.out.println("Total Gaji   : " + totalGaji);
        System.out.println("---------------------------");
    }
}

// Class Pegawai Tetap
class PegawaiTetap extends Pegawai {
    double tunjangan = 630000;
    double totalGaji;

    PegawaiTetap(String NIK, String nama, int kehadiran, double gaji) {
        this.NIK = NIK;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    void rekapGaji() {
        totalGaji = tunjangan + uangMakan + gaji;
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Total Gaji : " + totalGaji);
        System.out.println("---------------------------");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        PegawaiKontrak pk = new PegawaiKontrak(
                "PK001", "Moh Rama Alan Wijaya", 12, 20, 3000000);
        pk.rekapGaji();
        pk.tampilData();

        PegawaiTetap pt = new PegawaiTetap(
                "PT001", "Moh Rama Alan Wijaya", 22, 4000000);
        pt.rekapGaji();
        pt.tampilData();
    }
}
