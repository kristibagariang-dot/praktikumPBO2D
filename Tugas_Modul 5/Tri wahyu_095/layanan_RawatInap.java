package layanan;

import data.Pasien;

public class RawatInap extends Pasien {

    public String kamar;
    protected int lamaInap;

    public RawatInap(String nama, int umur,
                     String kamar, int lamaInap) {

        super(nama, umur);

        this.kamar = kamar;
        this.lamaInap = lamaInap;
    }

    public void infoRawat() {

        System.out.println("\n=== DATA RAWAT INAP ===");
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur        : " + umur);
        System.out.println("Kamar       : " + kamar);
        System.out.println("Lama Inap   : " + lamaInap + " hari");
    }
}
