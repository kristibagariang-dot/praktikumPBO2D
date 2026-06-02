package aricha;

public class Dokter {

    // public
    public String namaDokter;

    // protected
    protected String spesialis;

    // private
    private final String kodeDokter = "DK001";

    public Dokter(String namaDokter, String spesialis) {
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    // public method
    public void tampilDokter() {

        System.out.println("=== DATA DOKTER ===");
        System.out.println("Nama Dokter : " + namaDokter);
        System.out.println("Spesialis   : " + spesialis);

        tampilKode();
    }

    // private method
    private void tampilKode() {
        System.out.println("Kode Dokter : " + kodeDokter);
    }
}
