// Abstract class (Abstraction)
abstract class Pegawai {
    protected String nik;
    protected String nama;
    protected int kehadiran;
    protected int gaji;

    public Pegawai(String nik, String nama, int kehadiran, int gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    // Method abstract
    abstract int hitungGaji();

    // Method final
    public final void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran + " hari");
        System.out.println("Gaji Bersih: " + hitungGaji());
        tampilTambahan();
        System.out.println("-----------------------------");
    }

    protected void tampilTambahan() {
        // default kosong
    }
}

// Class turunan Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    public PegawaiKontrak(String nik, String nama, int masaKontrak, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    int hitungGaji() {
        int uangMakan = 15000 * kehadiran;
        return gaji + uangMakan;
    }

    @Override
    protected void tampilTambahan() {
        System.out.println("Masa Kontrak: " + masaKontrak + " bulan");
    }
}

// Final class Pegawai Tetap
final class PegawaiTetap extends Pegawai {
    private final int tunjangan = 630000;

    public PegawaiTetap(String nik, String nama, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, gaji);
    }

    @Override
    int hitungGaji() {
        int uangMakan = 15000 * kehadiran;
        return gaji + uangMakan + tunjangan;
    }

    @Override
    protected void tampilTambahan() {
        System.out.println("Status     : Pegawai Tetap");
        System.out.println("Tunjangan  : " + tunjangan);
    }
}

public class Tugas4 {
    public static void main(String[] args) {

        Pegawai[] dataPegawai = new Pegawai[2];

        // Data Pegawai 1 (Rama - Kontrak)
        dataPegawai[0] = new PegawaiKontrak(
                "301",
                "Rama",
                12,
                25,
                4000000);

        // Data Pegawai 2 (Alan - Tetap)
        dataPegawai[1] = new PegawaiTetap(
                "302",
                "Alan",
                27,
                5500000);

        System.out.println("=== DATA PEGAWAI ===");
        for (Pegawai p : dataPegawai) {
            p.tampilData();
        }
    }
}
