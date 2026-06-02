package admin;

public class Buku {

    public String judul = "Pelatihan Java";
    private int kode = 101;
    protected String rak = "Rak A";
    String kategori = "Teknologi";

    public void tampilJudul() {
        System.out.println("Judul: " + judul);
    }

    private void tampilKode() {
        System.out.println("Kode: " + kode);
    }

    protected void tampilRak() {
        System.out.println("Rak: " + rak);
    }

    void tampilKategori() {
        System.out.println("Kategori: " + kategori);
    }

    public void aksesPrivate() {
        tampilKode();
    }
}
