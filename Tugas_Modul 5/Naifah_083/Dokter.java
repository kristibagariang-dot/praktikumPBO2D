package dokter;

public class Dokter {
    public String namaDokter;
    protected String spesialis;
    String ruangan;
    private int gaji;

    public Dokter(String namaDokter, String spesialis) {
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
        ruangan = "Ruang A";
        gaji = 10000000;
    }

    public void tampilDokter() {
        System.out.println("Nama Dokter : " + namaDokter);
        System.out.println("Spesialis : " + spesialis);
        System.out.println("Ruangan : " + ruangan);

        tampilGaji();
    }

    private void tampilGaji() {
        System.out.println("Gaji : " + gaji);
    }

    void infoDokter() {
        System.out.println("Info Dokter");
    }

    protected void dataDokter() {
        System.out.println("Data Dokter");
    }
}
