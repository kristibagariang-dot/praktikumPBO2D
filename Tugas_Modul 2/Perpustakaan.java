/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Perpustakaan {

    // Superclass
    static class Buku {

        String judul;
        String pengarang;
        String penerbit;
        int tahunTerbit;
        String kategoriBuku;
        int stok;

        // Constructor kosong
        Buku() {}

        // Constructor berparameter
        Buku(String judul, String pengarang, String penerbit,
             int tahunTerbit, String kategoriBuku, int stok) {

            this.judul = judul;
            this.pengarang = pengarang;
            this.penerbit = penerbit;
            this.tahunTerbit = tahunTerbit;
            this.kategoriBuku = kategoriBuku;
            this.stok = stok;
        }

        void tampilBuku() {
            System.out.println("Judul Buku : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Penerbit : " + penerbit);
            System.out.println("Tahun Terbit : " + tahunTerbit);
            System.out.println("Kategori Buku : " + kategoriBuku);
            System.out.println("Stok Buku : " + stok);
        }
    }

    // Subclass
    static class Novel extends Buku {

        String kategoriNovel;
        String statusPeminjaman;

        // Constructor
        Novel(String judul, String pengarang, int tahunTerbit,
              String kategoriNovel, String statusPeminjaman) {

            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
            this.kategoriNovel = kategoriNovel;
            this.statusPeminjaman = statusPeminjaman;
        }

        void tampilNovel() {
            System.out.println("Judul Novel : " + judul);
            System.out.println("Penulis : " + pengarang);
            System.out.println("Tahun Terbit : " + tahunTerbit);
            System.out.println("Kategori Novel : " + kategoriNovel);
            System.out.println("Status Peminjaman : " + statusPeminjaman);
        }
    }

    // MAIN PROGRAM
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT BUKU
        System.out.println("=== INPUT DATA BUKU ===");

        System.out.print("Judul Buku : ");
        String judulBuku = input.nextLine();

        System.out.print("Pengarang : ");
        String pengarang = input.nextLine();

        System.out.print("Penerbit : ");
        String penerbit = input.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahun = input.nextInt();
        input.nextLine();

        System.out.print("Kategori Buku : ");
        String kategori = input.nextLine();

        System.out.print("Stok Buku : ");
        int stok = input.nextInt();

        Buku buku = new Buku(judulBuku, pengarang, penerbit, tahun, kategori, stok);

        System.out.println("\n=== DATA BUKU ===");
        buku.tampilBuku();

        input.nextLine();

        // INPUT NOVEL
        System.out.println("\n=== INPUT DATA NOVEL ===");

        System.out.print("Judul Novel : ");
        String judulNovel = input.nextLine();

        System.out.print("Penulis : ");
        String penulis = input.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahunNovel = input.nextInt();
        input.nextLine();

        System.out.print("Kategori Novel : ");
        String kategoriNovel = input.nextLine();

        System.out.print("Status Peminjaman : ");
        String status = input.nextLine();

        Novel novel = new Novel(judulNovel, penulis, tahunNovel, kategoriNovel, status);

        System.out.println("\n=== DATA NOVEL ===");
        novel.tampilNovel();

        // CEK NOVEL BARU / LAMA
        System.out.print("\nMasukkan batas tahun novel baru: ");
        int batas = input.nextInt();

        if (tahunNovel >= batas) {
            System.out.println("Novel termasuk NOVEL BARU");
        } else {
            System.out.println("Novel termasuk NOVEL LAMA");
        }

        input.close();
    }
}
