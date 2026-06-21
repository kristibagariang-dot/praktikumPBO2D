class Koleksi {
    String judul;
    int tahunTerbit;
}

class Buku extends Koleksi {
    String pengarang;
    String penerbit;
    String kategoriBuku;
    int stokBuku;

    void tampilBuku() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori : " + kategoriBuku);
        System.out.println("Stok : " + stokBuku);
    }
}

class Novel extends Koleksi {
    String penulis;
    String kategoriNovel;
    String statusPeminjaman;

    void tampilNovel() {
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori : " + kategoriNovel);
        System.out.println("Status : " + statusPeminjaman);
    }
}

public class Main {
    public static void main(String[] args) {

        Buku b = new Buku();
        b.judul = "Pemrograman Java";
        b.pengarang = "Budi";
        b.penerbit = "Informatika";
        b.tahunTerbit = 2023;
        b.kategoriBuku = "Buku Teknik";
        b.stokBuku = 10;

        Novel n = new Novel();
        n.judul = "Senja";
        n.penulis = "Tere Liye";
        n.tahunTerbit = 2022;
        n.kategoriNovel = "Novel Romantis";
        n.statusPeminjaman = "Tersedia";

        b.tampilBuku();
        System.out.println();
        n.tampilNovel();
    }
