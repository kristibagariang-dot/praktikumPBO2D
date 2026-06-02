import java.util.Scanner;

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

    abstract int hitungGaji();

    public void tampilData() {
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran + " hari");
        System.out.println("Gaji Bersih: " + hitungGaji());
        System.out.println("-----------------------------");
    }
}
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
    public void tampilData() {
        super.tampilData();
        System.out.println("Masa Kontrak: " + masaKontrak + " bulan");
    }
}
class PegawaiTetap extends Pegawai {
    private final int tunjangan = 630000;
    public PegawaiTetap(String nik, String nama, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, gaji);
    }
    @Override
    int hitungGaji() {
        int uangMakan = 15000 * kehadiran;
        return gaji + uangMakan + tunjangan;
    }
}
public class TugasModul3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pegawai: ");
        int n = input.nextInt();
        input.nextLine();

        Pegawai[] dataPegawai = new Pegawai[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPegawai ke-" + (i + 1));
            System.out.print("Status (1=Kontrak, 2=Tetap): ");
            int status = input.nextInt();
            input.nextLine();

            System.out.print("NIK: ");
            String nik = input.nextLine();

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Kehadiran: ");
            int kehadiran = input.nextInt();

            System.out.print("Gaji Pokok: ");
            int gaji = input.nextInt();

            if (status == 1) {
                System.out.print("Masa Kontrak (bulan): ");
                int masaKontrak = input.nextInt();
                dataPegawai[i] = new PegawaiKontrak(nik, nama, masaKontrak, kehadiran, gaji);
            } else {
                dataPegawai[i] = new PegawaiTetap(nik, nama, kehadiran, gaji);
            }
        }

        System.out.println("\n=== DATA PEGAWAI ===");
        for (Pegawai p : dataPegawai) {
            p.tampilData();
        }

        input.close();
    }
}
