package data;

public class Dokter {

    public String namaDokter;
    protected String spesialis;

    public Dokter(String namaDokter, String spesialis) {
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    public void tampilDokter() {
        System.out.println("\n=== DATA DOKTER ===");
        System.out.println("Nama Dokter : " + namaDokter);
        System.out.println("Spesialis   : " + spesialis);
    }
} 
