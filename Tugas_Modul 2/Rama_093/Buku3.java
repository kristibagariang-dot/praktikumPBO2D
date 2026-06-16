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
        System.out.println("Judul Novel      : " + judul);
        System.out.println("Penulis          : " + penulis);
        System.out.println("Tahun Terbit     : " + tahunTerbit);
        System.out.println("Kategori Novel   : " + kategoriNovel);
        System.out.println("Status Peminjaman: " + statusPeminjaman);
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

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Buku buku = new Buku();
        buku.judul = "Pemrograman Java Dasar";
        buku.pengarang = "Moh Rama Alan Wijaya";
        buku.penerbit = "Informatika Press";
        buku.tahunTerbit = 2026;
        buku.kategoriBuku = "Teknologi";
        buku.stokBuku = 10;

        System.out.println("=== DATA BUKU ===");
        buku.tampilkanBuku();

        System.out.print("\nMasukkan batas tahun untuk menentukan novel lama/baru: ");
        int batasTahun = input.nextInt();

        NovelBaru novel = new NovelBaru();

        novel.judul = "Langkah Menuju Impian";
        novel.penulis = "Moh Rama Alan Wijaya";
        novel.tahunTerbit = 2026;
        novel.kategoriNovel = "Inspiratif";
        novel.statusPeminjaman = "Tersedia";

        System.out.println("\n=== DATA NOVEL ===");
        novel.tampilkanNovel();

        System.out.println("\n=== HASIL PENGECEKAN ===");

        if (novel.tahunTerbit < batasTahun) {
            NovelLama nlama = new NovelLama();
            nlama.tahunTerbit = novel.tahunTerbit;
            nlama.cekTahun(batasTahun);
        } else {
            novel.cekTahun(batasTahun);
        }

        input.close();
    }
}
