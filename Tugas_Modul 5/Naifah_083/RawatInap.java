package pasien;

public class RawatInap {

    public String namaPerawat = "Citra";
    protected int nomorKamar = 12;
    String lantai = "Lantai 2";
    private String jenisKamar;

    public RawatInap(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public void tampilKamar() {
        System.out.println("Jenis Kamar : " + jenisKamar);
        System.out.println("Perawat : " + namaPerawat);
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Lokasi : " + lantai);
    }

    private void dataKamar() {
        System.out.println("Data Kamar");
    }

    void infoKamar() {
        System.out.println("Info Kamar");
    }

    protected void detailKamar() {
        System.out.println("Detail Kamar");
    }
}