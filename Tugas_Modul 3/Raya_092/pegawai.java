import java.util.Scanner;

// ================= SUPER CLASS =================
class Pegawai {
    protected String nik;
    protected String nama;
    protected int kehadiran;
    protected double gaji;
    protected double uangMakan;

    // Constructor kosong
    public Pegawai() {

    }

    // Constructor parameter
    public Pegawai(String nik, String nama, int kehadiran, double gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
        this.uangMakan = kehadiran * 15000;
    }

    // Method polymorphism
    public double rekapGaji() {
        return 0;
    }

    public void tampilData() {
        System.out.println("NIK           : " + nik);
        System.out.println("Nama          : " + nama);
        System.out.println("Kehadiran     : " + kehadiran);
        System.out.println("Uang Makan    : Rp " + uangMakan);
        System.out.println("Gaji Pokok    : Rp " + gaji);
    }
}

// ================= CLASS PEGAWAI KONTRAK =================
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    // Constructor
    public PegawaiKontrak(String nik, String nama,
                           int masaKontrak, int kehadiran,
                           double gaji) {

        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
    }

    // Override method
    @Override
    public double rekapGaji() {
        return uangMakan + gaji;
    }

    @Override
    public void tampilData() {
        System.out.println("\n===== DATA PEGAWAI KONTRAK =====");
        super.tampilData();
        System.out.println("Masa Kontrak  : " + masaKontrak + " bulan");
        System.out.println("Total Gaji    : Rp " + rekapGaji());
    }
}

// ================= CLASS PEGAWAI TETAP =================
class PegawaiTetap extends Pegawai {
    private double tunjangan = 630000;

    // Constructor
    public PegawaiTetap(String nik, String nama,
                         int kehadiran, double gaji) {

        super(nik, nama, kehadiran, gaji);
    }

    // Override method
    @Override
    public double rekapGaji() {
        return tunjangan + uangMakan + gaji;
    }

    @Override
    public void tampilData() {
        System.out.println("\n===== DATA PEGAWAI TETAP =====");
        super.tampilData();
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Total Gaji    : Rp " + rekapGaji());
    }
}

// ================= MAIN CLASS =================
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== SISTEM DATA PEGAWAI =====");
        System.out.println("1. Pegawai Tetap");
        System.out.println("2. Pegawai Kontrak");
        System.out.print("Pilih jenis pegawai : ");
        int pilih = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan NIK : ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kehadiran : ");
        int hadir = input.nextInt();

        System.out.print("Masukkan Gaji Pokok : ");
        double gaji = input.nextDouble();

        Pegawai pegawai;

        // ================= POLYMORPHISM =================
        if (pilih == 1) {

            pegawai = new PegawaiTetap(
                    nik,
                    nama,
                    hadir,
                    gaji
            );

        } else {

            System.out.print("Masukkan Masa Kontrak (bulan) : ");
            int masaKontrak = input.nextInt();

            pegawai = new PegawaiKontrak(
                    nik,
                    nama,
                    masaKontrak,
                    hadir,
                    gaji
            );
        }

        // Menampilkan data
        pegawai.tampilData();
    }
}
