import java.util.Scanner;

// Superclass
class Koleksi {
    protected String judul;
    protected int tahunTerbit;

    // Constructor 1
    public Koleksi() {
    }

    // Constructor 2
    public Koleksi(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilData() {
        System.out.println("Judul         : " + judul);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
    }
}

// Subclass Buku
class Buku extends Koleksi {
    private String pengarang;
    private String penerbit;
    private String kategoriBuku;
    private int stok;

    public Buku() {
    }

    public Buku(String judul, int tahunTerbit, String pengarang,
                String penerbit, String
