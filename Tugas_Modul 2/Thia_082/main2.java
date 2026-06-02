//soal 3
import java.util.Scanner;

class Koleksi {
    String judul;
    int tahunTerbit;

    Koleksi(){}

    Koleksi(String judul, int tahunTerbit){
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    void tampilDasar(){
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
class Buku extends Koleksi {
    String pengarang;
    String penerbit;
    String kategoriBuku;
    int stok;

    Buku(){}

    Buku(String judul, int tahunTerbit, String pengarang, 
            String penerbit, String kategoriBuku, int stok){
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategoriBuku = kategoriBuku;
        this.stok = stok;
    }

    void tampilBuku(){
        tampilDasar();
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori Buku: " + kategoriBuku);
        System.out.println("Stok: " + stok);
    }
}
class Novel extends Koleksi {
    String penulis;
    String kategoriNovel;
    String statusPeminjaman;

    Novel(String judul, int tahunTerbit, String penulis, 
            String kategoriNovel, String statusPeminjaman){
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.statusPeminjaman = statusPeminjaman;
    }
    void tampilNovel(){
        tampilDasar();
        System.out.println("Penulis: " + penulis);
        System.out.println("Kategori Novel: " + kategoriNovel);
        System.out.println("Status Peminjaman: " + statusPeminjaman);
    }
}
class NovelLama extends Novel {

    NovelLama(String judul, int tahunTerbit, String penulis,
            String kategoriNovel, String statusPeminjaman){
        super(judul, tahunTerbit, penulis, kategoriNovel, 
                statusPeminjaman);
    }
    void info(){
        System.out.println("Kategori: Novel Lama");
    }
}
class NovelBaru extends Novel {

    NovelBaru(String judul, int tahunTerbit, String penulis, 
            String kategoriNovel, String statusPeminjaman){
        super(judul, tahunTerbit, penulis, kategoriNovel, 
                statusPeminjaman);
    }
    void info(){
        System.out.println("Kategori: Novel Baru");
    }
}
public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Judul Novel: ");
        String judul = sc.nextLine();

        System.out.print("Tahun Terbit Novel: ");
        int tahun = sc.nextInt();
        sc.nextLine();

        System.out.print("Penulis: ");
        String penulis = sc.nextLine();

        System.out.print("Kategori Novel: ");
        String kategori = sc.nextLine();

        System.out.print("Status Peminjaman: ");
        String status = sc.nextLine();

        System.out.print("Masukkan Batas Tahun Novel Lama: ");
        int batas = sc.nextInt();

        if(tahun <= batas){
            NovelLama novel = new NovelLama(judul, tahun, 
                    penulis, kategori, status);
            System.out.println("\nData Novel");
            novel.tampilNovel();
            novel.info();
        }else{
            NovelBaru novel = new NovelBaru(judul, tahun, 
                    penulis, kategori, status);
            System.out.println("\nData Novel");
            novel.tampilNovel();
            novel.info();
        }
    }
}
