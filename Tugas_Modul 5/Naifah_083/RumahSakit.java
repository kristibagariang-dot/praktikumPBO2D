package naifah;

public class RumahSakit {
    public final String NAMA_RS = "RS Sehat Selalu";
    protected String alamat = "Surabaya";
    String telepon = "031-123456";
    private int jumlahDokter = 10;

    public RumahSakit() {

    }

    public void tampilRumahSakit() {
        System.out.println("Nama Rumah Sakit : " + NAMA_RS);
        System.out.println("Alamat : " + alamat);
        System.out.println("Telepon : " + telepon);
        tampilJumlahDokter();
    }

    private void tampilJumlahDokter() {
        System.out.println("Jumlah Dokter : " + jumlahDokter);
    }

    void infoRumahSakit() {
        System.out.println("Info Rumah Sakit");
    }

    protected void dataRumahSakit() {
        System.out.println("Data Rumah Sakit");
    }
}