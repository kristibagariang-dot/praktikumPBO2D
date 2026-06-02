package Modul2;

import java.util.Scanner;

class Buku {
    String judul;
    int tahunTerbit;

    Buku(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampil() {
        System.out.println("Judul : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}

class BukuData extends Buku {
    String pengarang;
    String penerbit;
    String kategori;
    int stok;

    BukuData(String judul, int tahun, String pengarang, String penerbit,
            String kategori, int stok) {
        super(judul, tahun);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    void tampilData() {
        tampil();
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok : " + stok);
    }
}

class Novel extends Buku {
    String penulis;
    String kategoriNovel;
    String status;

    Novel(String judul, int tahun, String penulis, 
            String kategoriNovel, String status) {
        super(judul, tahun);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.status = status;
    }

    void tampilNovel() {
        tampil();
        System.out.println("Penulis : " + penulis);
        System.out.println("Kategori Novel : " + kategoriNovel);
        System.out.println("Status Peminjaman : " + status);
    }
}

//turunan untuk Novel Lama
class NovelLama extends Novel {

    NovelLama(String judul, int tahun, String penulis, 
            String kategoriNovel, String status) {
        super(judul, tahun, penulis, kategoriNovel, status);
    }

    void info() {
        System.out.println("Jenis : Novel Lama");
    }
}

//turunan untuk Novel Baru
class NovelBaru extends Novel {

    NovelBaru(String judul, int tahun, String penulis, 
            String kategoriNovel, String status) {
        super(judul, tahun, penulis, kategoriNovel, status);
    }

    void info() {
        System.out.println("Jenis : Novel Baru");
    }
}

public class Main {

    static void cekTahun(Novel n, int batasTahun) {
        if (n.tahunTerbit < batasTahun) {
            System.out.println(n.judul + " termasuk Novel Lama");
        } else {
            System.out.println(n.judul + " termasuk Novel Baru");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BukuData b1 = new BukuData("Pendidikan Karakter", 2024, "Naifah",
                "Trunojoyo", "Buku Pendidikan", 10);

        System.out.println("Data Buku 1");
        b1.tampilData();
        
        Novel n1 = new Novel("Cinta Senja",2025,"Budi","Romantis","Dipinjam");
        Novel n2 = new Novel("Medan Pertempuran",2024,"Putri","Novel Perang",
                "Tersedia");
        Novel n3 = new Novel("Rumah Tua",2023,"Dina","Novel Horor","Dipinjam");

        System.out.print("\nMasukkan batas tahun novel: ");
        int batas = input.nextInt();

        System.out.println("\nData Novel");
        n1.tampilNovel();
        cekTahun(n1, batas);

        System.out.println();
        n2.tampilNovel();
        cekTahun(n2, batas);

        System.out.println();
        n3.tampilNovel();
        cekTahun(n3, batas);
    }
}
