abstract class Pegawai {
    protected String nik;
    protected String nama;
    protected int kehadiran;
    protected double gaji;

    public Pegawai(String nik, String nama, int kehadiran, double gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    // abstract method
    public abstract double rekapGaji();

    // final method (tidak bisa dioverride)
    public final void infoPerusahaan() {
        System.out.println("PT. Surya Pratama");
    }

    public void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji Pokok : " + gaji);
    }
}

// Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;
    private double uangMakan;

    public PegawaiKontrak(String nik, String nama,
                          int masaKontrak,
                          int kehadiran,
                          double gaji) {

        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
        this.uangMakan = kehadiran * 15000;
    }

    @Override
    public double rekapGaji() {
        return gaji + uangMakan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Masa Kontrak : " + masaKontrak);
        System.out.println("Gaji Bersih  : " + rekapGaji());
    }
}

// Pegawai Tetap
class PegawaiTetap extends Pegawai {
    private final double tunjangan = 630000;
