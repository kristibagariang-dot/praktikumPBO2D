package pasien;

public class DataPasien {

    // public
    public String nama;

    // protected
    protected int umur;

    // private
    private String alamat = "Pamekasan";

    public DataPasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void infoPasien() {

        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur        : " + umur);

        tampilAlamat();
    }

    // private method
    private void tampilAlamat() {
        System.out.println("Alamat      : " + alamat);
    }
}
