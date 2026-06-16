class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;
    String kategoriBuku;
    int stokBuku;

    void tampilkanBuku() {
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Penerbit      : " + penerbit);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
        System.out.println("Kategori Buku : " + kategoriBuku);
        System.out.println("Stok Buku     : " + stokBuku);
    }
}

class Novel {
    String judul;
    String penulis;
    int tahunTerbit;
    String kategoriNovel;
    String statusPeminjaman;

    void tampilkanNovel() {
        System.out.println("Judul Novel      : " + judul);
        System.out.println("Penulis          : " + penulis);
        System.out.println("Tahun Terbit     : " + tahunTerbit);
        System.out.println("Kategori Novel   : " + kategoriNovel);
        System.out.println("Status Peminjaman: " + statusPeminjaman);
    }
}

public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku();

        buku1.judul = "Pemrograman Java Dasar";
        buku1.pengarang = "Moh Rama Alan Wijaya";
        buku1.penerbit = "Hikmah Ilmu";
        buku1.tahunTerbit = 2026;
        buku1.kategoriBuku = "Teknologi";
        buku1.stokBuku = 24;

        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanBuku();

        System.out.println();

        Novel novel1 = new Novel();

        novel1.judul = "Langkah Menuju Impian";
        novel1.penulis = "Moh Rama Alan Wijaya";
        novel1.tahunTerbit = 2026;
        novel1.kategoriNovel = "Inspiratif";
        novel1.statusPeminjaman = "Tersedia";

        System.out.println("=== DATA NOVEL ===");
        novel1.tampilkanNovel();
    }
}
