public class MainPegawai {

    public static void main(String[] args) {

        Pegawai p1 = new PegawaiKontrak("PK001", "Andi", 12, 20, 3000000);
        Pegawai p2 = new PegawaiTetap("PT001", "Budi", 22, 3500000);

        p1.tampilData();
        p2.tampilData();

        // Contoh class final
        Perusahaan perusahaan = new Perusahaan("PT. Surya Pratama");
        perusahaan.tampilPerusahaan();
    }
}

// ================= ABSTRACT CLASS =================
abstract class Pegawai {
    String NIK;
    String nama;
    int kehadiran;
    int gaji;

    Pegawai(String NIK, String nama, int kehadiran, int gaji) {
        this.NIK = NIK;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    // abstract method (WAJIB dioverride)
    abstract int rekapGaji();

    // final method (TIDAK bisa dioverride)
    final void infoDasar() {
        System.out.println("NIK : " + NIK);
        System.out.println("Nama : " + nama);
    }

    // method biasa
    void tampilData() {
        infoDasar();
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Gaji Pokok : " + gaji);
    }
}

// ================= PEGAWAI KONTRAK =================
class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    int uangMakan;

    PegawaiKontrak(String NIK, String nama, int masaKontrak, int kehadiran, int gaji) {
        super(NIK, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    int rekapGaji() {
        return uangMakan + gaji;
    }

    @Override
    void tampilData() {
        System.out.println("===== Pegawai Kontrak =====");
        infoDasar(); // pakai method final
        System.out.println("Masa Kontrak : " + masaKontrak + " bulan");
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Total Gaji : " + rekapGaji());
        System.out.println();
    }
}

// ================= PEGAWAI TETAP =================
class PegawaiTetap extends Pegawai {
    int tunjangan = 630000;
    int uangMakan;

    PegawaiTetap(String NIK, String nama, int kehadiran, int gaji) {
        super(NIK, nama, kehadiran, gaji);
        this.uangMakan = 15000 * kehadiran;
    }

    @Override
    int rekapGaji() {
        return tunjangan + uangMakan + gaji;
    }

    @Override
    void tampilData() {
        System.out.println("===== Pegawai Tetap =====");
        infoDasar(); // pakai method final
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Total Gaji : " + rekapGaji());
        System.out.println();
    }
}

// ================= FINAL CLASS =================
final class Perusahaan {
    String namaPerusahaan;

    Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    void tampilPerusahaan() {
        System.out.println("Perusahaan : " + namaPerusahaan);
    }
}
