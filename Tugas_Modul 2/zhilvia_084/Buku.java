class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;
    String kategoriBuku;
    int stokBuku;

    void tampilkanBuku() {
        System.out.println("Judul Buku      : " + judul);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Penerbit        : " + penerbit);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Kategori Buku   : " + kategoriBuku);
        System.out.println("Stok Buku       : " + stokBuku);
    }
}

class Novel {
    String judul;
    String penulis;
    int tahunTerbit;
    String kategoriNovel;
    String statusPeminjaman;

    void tampilkanNovel() {
        System.out.println("Judul Novel     : " + judul);
        System.out.println("Penulis         : " + penulis);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Kategori Novel  : " + kategoriNovel);
        System.out.println("Status Tersedia : " + statusPeminjaman);
    }
}

class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.judul = "Dasar Ilmu Komputer";
        buku1.pengarang = "Zhilvia Qutrun Nada Mk";
        buku1.penerbit = "Informatika";
        buku1.tahunTerbit = 2024;
        buku1.kategoriBuku = "Pendidikan";
        buku1.stokBuku = 10;

        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanBuku();

        System.out.println();

        Novel novel1 = new Novel();
        novel1.judul = "Cinta di Ujung Senja";
        novel1.penulis = "Zhilvia Qutrun Nada Mk";
        novel1.tahunTerbit = 2029;
        novel1.kategoriNovel = "Romantis";
        novel1.statusPeminjaman = "Tersedia";

        System.out.println("=== DATA NOVEL ===");
        novel1.tampilkanNovel();
    }
}
