abstract class Pegawai { // 1. Abstract class
    String NIK, Nama;
    int Kehadiran;
    double Gaji, UangMakan;

    Pegawai(String NIK, String Nama, int Kehadiran, double Gaji) {
        this.NIK = NIK; this.Nama = Nama;
        this.Kehadiran = Kehadiran; this.Gaji = Gaji;
        this.UangMakan = 15000 * Kehadiran;
    }

    abstract void rekapGaji(); // 2. Abstract method

    final void cetakIdentitas() { // 3. Final method, gak bisa di-override
        System.out.println("NIK: " + NIK + ", Nama: " + Nama);
    }
}

class PegawaiTetap extends Pegawai {
    PegawaiTetap(String NIK, String Nama, int Kehadiran, double Gaji) {
        super(NIK, Nama, Kehadiran, Gaji);
    }
    void rekapGaji() {
        System.out.println(Gaji + UangMakan + 630000);
    }
}

final class PegawaiKontrak extends Pegawai { // 4. Final class, gak bisa diturunkan
    PegawaiKontrak(String NIK, String Nama, int Kehadiran, double Gaji) {
        super(NIK, Nama, Kehadiran, Gaji);
    }
    void rekapGaji() {
        System.out.println(Gaji + UangMakan);
    }
}
