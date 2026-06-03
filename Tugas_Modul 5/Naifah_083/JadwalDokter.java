package dokter;

public class JadwalDokter {

    public final String JAM_BUKA = "08.00 WIB";
    protected String poli = "Umum";
    String gedung = "Gedung B";
    private String hari;

    public JadwalDokter(String hari) {
        this.hari = hari;
    }

    public void tampilJadwal() {
        System.out.println("Hari Praktik : " + hari);
        System.out.println("Jam Buka : " + JAM_BUKA);
        System.out.println("Poli : " + poli);
        System.out.println("Gedung : " + gedung);
    }

    private void detailJadwal() {
        System.out.println("Detail Jadwal");
    }

    void infoJadwal() {
        System.out.println("Info Jadwal");
    }

    protected void dataJadwal() {
        System.out.println("Data Jadwal");
    }
}