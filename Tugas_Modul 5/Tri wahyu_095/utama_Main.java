package utama;

import data.Pasien;
import data.Dokter;
import layanan.RawatInap;
import layanan.Pembayaran;

public class Main {

    public static void main(String[] args) {

        // Objek pasien
        Pasien p1 = new Pasien("Fajar", 20);

        // Objek dokter
        Dokter d1 = new Dokter("Dr. Andi", "Penyakit Dalam");

        // Objek rawat inap
        RawatInap r1 = new RawatInap(
                "Fajar",
                20,
                "Melati 02",
                3
        );

        // Objek pembayaran
        Pembayaran bayar = new Pembayaran();

        // Output
        p1.tampilPasien();

        d1.tampilDokter();

        r1.infoRawat();

        bayar.totalBayar(3);
    }
}
