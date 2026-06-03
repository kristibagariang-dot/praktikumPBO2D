package pasien;

public class Pasien {
    public String nama;
    protected int umur;
    String alamat;
    private String penyakit;

    public Pasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        alamat = "Surabaya";
        penyakit = "Demam";
    }

    public void tampilPasien() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur Pasien : " + umur);
        System.out.println("Alamat : " + alamat);

        tampilPenyakit();
    }

    private void tampilPenyakit() {
        System.out.println("Penyakit : " + penyakit);
    }

    void infoPasien() {
        System.out.println("Informasi Pasien");
    }

    protected void dataPasien() {
        System.out.println("Data Pasien");
    }
}