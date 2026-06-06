/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author param
 */
import java.util.Scanner;

class Buku {   //class induk

    String judul;    //atribut/ variabel
    String pengarang;
    String penerbit;
    int tahunTerbit;
    String kategoriBuku;
    int stok;

    Buku(){}  // constructor non parameter

    Buku(String judul,String pengarang,String penerbit,int tahunTerbit,String kategoriBuku,int stok){ // constructor dengan parameter
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.kategoriBuku = kategoriBuku;
        this.stok = stok;
        //this untuk membedakan atribut dengan parameternya
    }

    void tampilBuku(){  //untuk menampilkan data yang dibuat
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori Buku : " + kategoriBuku);
        System.out.println("Stok : " + stok);
    }
}

class Novel extends Buku{ //kelas turunan 

    String penulis;
    String kategoriNovel;
    String statusPeminjaman;

    Novel(){}

    Novel(String judul,String penulis,int tahunTerbit,String kategoriNovel,String statusPeminjaman){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategoriNovel = kategoriNovel;
        this.statusPeminjaman = statusPeminjaman;
    }

    void tampilNovel(){
        System.out.println("Judul Novel : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori Novel : " + kategoriNovel);
        System.out.println("Status Peminjaman : " + statusPeminjaman);
    }
}

class NovelBaru extends Novel{  //clas baru untuk baru dicetak

    void cekNovel(int batas){
        if(tahunTerbit >= batas){
            System.out.println("Novel termasuk Novel Baru");
        }else{
            System.out.println("Novel bukan Novel Baru");
        }
    }

}

class NovelLama extends Novel{

    void cekNovel(int batas){
        if(tahunTerbit < batas){
            System.out.println("Novel termasuk Novel Lama");
        }else{
            System.out.println("Novel bukan Novel Lama");
        }
    }

}

public class Main{
    //sebagai kelas utama untuk menjalankan program yang akan kita pilih

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Buku buku = new Buku();
        Novel novel = new Novel();

        System.out.println("=== Input Data Buku ===");

        System.out.print("Judul : ");
        buku.judul = input.nextLine();

        System.out.print("Pengarang : ");
        buku.pengarang = input.nextLine();

        System.out.print("Penerbit : ");
        buku.penerbit = input.nextLine();

        System.out.print("Tahun Terbit : ");
        buku.tahunTerbit = input.nextInt();
        input.nextLine();

        System.out.print("Kategori Buku : ");
        buku.kategoriBuku = input.nextLine();

        System.out.print("Stok Buku : ");
        buku.stok = input.nextInt();
        input.nextLine();

        System.out.println("\n=== Input Data Novel ===");

        System.out.print("Judul Novel : ");
        novel.judul = input.nextLine();

        System.out.print("Penulis : ");
        novel.penulis = input.nextLine();

        System.out.print("Tahun Terbit : ");
        novel.tahunTerbit = input.nextInt();
        input.nextLine();

        System.out.print("Kategori Novel : ");
        novel.kategoriNovel = input.nextLine();

        System.out.print("Status Peminjaman : ");
        novel.statusPeminjaman = input.nextLine();

        System.out.println("\n=== Data Buku ===");
        buku.tampilBuku();

        System.out.println("\n=== Data Novel ===");
        novel.tampilNovel();

        System.out.print("\nMasukkan batas tahun novel : ");
        int batas = input.nextInt();

        if(novel.tahunTerbit >= batas){
            System.out.println("Novel termasuk Novel Baru");
        }else{
            System.out.println("Novel termasuk Novel Lama");
        }

    }
}
