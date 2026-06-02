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

    Buku(String judul, int tahunTerbit, String pengarang, String penerbit, String kategoriBuku, int stok){
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

    Novel(){}

    Novel(String judul, int tahunTerbit, String penulis, String kategoriNovel, String statusPeminjaman){
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

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Judul Buku: ");
        String judulBuku = sc.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunBuku = sc.nextInt();
        sc.nextLine();
        System.out.print("Pengarang: ");
        String pengarang = sc.nextLine();
        System.out.print("Penerbit: ");
        String penerbit = sc.nextLine();
        System.out.print("Kategori Buku: ");
        String kategoriBuku = sc.nextLine();
        System.out.print("Stok: ");
        int stok = sc.nextInt();
        sc.nextLine();

        Buku buku = new Buku(judulBuku, tahunBuku, pengarang, penerbit, kategoriBuku, stok);

        System.out.print("\nJudul Novel: ");
        String judulNovel = sc.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunNovel = sc.nextInt();
        sc.nextLine();
        System.out.print("Penulis: ");
        String penulis = sc.nextLine();
        System.out.print("Kategori Novel: ");
        String kategoriNovel = sc.nextLine();
        System.out.print("Status Peminjaman: ");
        String status = sc.nextLine();

        Novel novel = new Novel(judulNovel, tahunNovel, penulis, kategoriNovel, status);

        System.out.println("\nData Buku");
        buku.tampilBuku();

        System.out.println("\nData Novel");
        novel.tampilNovel();
    }
}
