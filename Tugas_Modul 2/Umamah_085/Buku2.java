/*@author Taufiq*/
import java.util.Scanner;

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
        System.out.println("Judul Novel       : " + judul);
        System.out.println("Penulis           : " + penulis);
        System.out.println("Tahun Terbit      : " + tahunTerbit);
        System.out.println("Kategori Novel    : " + kategoriNovel);
        System.out.println("Status Peminjaman : " + statusPeminjaman);
    }
}
class NovelLama extends Novel {

    void cekTahun(int batasTahun) {
        if (tahunTerbit < batasTahun) {
            System.out.println("Kategori: Novel Lama");
        }
    }
}
class NovelBaru extends Novel {

    void cekTahun(int batasTahun) {
        if (tahunTerbit >= batasTahun) {
            System.out.println("Kategori: Novel Baru");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buku buku1 = new Buku();
        buku1.judul = "MenjadiLebih Baik";
        buku1.pengarang = "MahsunatulUmamah";
        buku1.penerbit = "Aditya Purnama";
        buku1.tahunTerbit = 2003;
        buku1.kategoriBuku = "Agama";
        buku1.stokBuku = 10;

        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanBuku();

        System.out.println();

    }
}
