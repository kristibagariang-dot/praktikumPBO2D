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
        if (tahunTerbit <= batasTahun) {
            System.out.println("Kategori : Novel Lama");
        }
    }
}

class NovelBaru extends Novel {
    void cekTahun(int batasTahun) {
        if (tahunTerbit > batasTahun) {
            System.out.println("Kategori : Novel Baru");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Buku buku1 = new Buku();
        buku1.judul = "Pembuatan Website";
        buku1.pengarang = "Ima Rotul Hasanah";
        buku1.penerbit = "Informatika";
        buku1.tahunTerbit = 2030;
        buku1.kategoriBuku = "Teknik";
        buku1.stokBuku = 10;

        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanBuku();

        System.out.println();

        System.out.print("Masukkan batas tahun: ");
        int batasTahun = input.nextInt();

        NovelBaru novel1 = new NovelBaru();
        novel1.judul = "A dan Z";
        novel1.penulis = "Ima Rotul Hasanah";
        novel1.tahunTerbit = 2030;
        novel1.kategoriNovel = "Religius";
        novel1.statusPeminjaman = "Tersedia";

        System.out.println("\n=== DATA NOVEL ===");
        novel1.tampilkanNovel();

        System.out.println("\n=== HASIL PENGECEKAN ===");

        if (novel1.tahunTerbit > batasTahun) {
            novel1.cekTahun(batasTahun);
        } else {
            NovelLama lama = new NovelLama();
            lama.tahunTerbit = novel1.tahunTerbit;
            lama.cekTahun(batasTahun);
        }
    }
}
