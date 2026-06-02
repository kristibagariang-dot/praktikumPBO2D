package aricha;

import pasien.DataPasien;
import pasien.RekamMedis;
import pelayanan.Pemeriksaan;
import pelayanan.Obat;

public class Pasien extends DataPasien {

    // final
    public final String rumahSakit = "RS Sehat Sentosa";

    public Pasien(String nama, int umur) {
        super(nama, umur);
    }

    public void tampilPasien() {

        System.out.println("=== DATA PASIEN ===");

        infoPasien();

        System.out.println("Rumah Sakit : " + rumahSakit);
    }

    public void periksa() {

        Pemeriksaan p = new Pemeriksaan();
        RekamMedis rm = new RekamMedis();
        Obat o = new Obat();

        System.out.println();
        rm.tampilRM();
        p.tampilHasil();
        o.tampilObat();
    }
}
