class Buku {

    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;
    String kategoriBuku;
    int stokBuku;

    Buku() {
    }

    Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    Buku(String judul, String pengarang, String penerbit,
         int tahunTerbit, String kategoriBuku, int stokBuku) {

        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.kategoriBuku = kategoriBuku;
        this.stokBuku = stokBuku;
    }

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

    Novel() {
    }

    Novel(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    Novel(String judul, String penulis, int tahunTerbit,
          String kategoriNovel, String statusPeminjaman) {

        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategoriNovel = kategoriNovel;
        this.statusPeminjaman = statusPeminjaman;
    }

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

        Buku buku1 = new Buku(
                "Jalan Menuju Ketakwaan",
                "Sitti Arika",
                "Hikmah Ilmu",
                2030,
                "Agama",
                24
        );

        buku1.tampilkanBuku();

        System.out.println();

        Novel novel1 = new Novel(
                "Assalamu'alaikum Calon Imam",
                "Sitti Arika",
                2030,
                "Religius",
                "Tersedia"
        );

        novel1.tampilkanNovel();
    }
          }
