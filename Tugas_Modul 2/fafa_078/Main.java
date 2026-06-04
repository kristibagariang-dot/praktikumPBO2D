import java.util.Scanner;
class Koleksi {
    protected String judul;
    protected int tahunTerbit;
  
    // Constructor   
    public Koleksi() {}
    void inputDasar(Scanner sc) {
        System.out.print("Judul: ");
        judul = sc.nextLine();

        System.out.print("Tahun Terbit: ");
        tahunTerbit = sc.nextInt();
        sc.nextLine();
        
// membersihkan buffer
    }
    void tampilDasar() {
        System.out.println("Judul          : " + judul);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
    }
}
class Buku extends Koleksi {
    private String pengarang;
    private String penerbit;
    private String kategoriBuku;
    private int stok;

    void inputBuku(Scanner sc) {
        inputDasar(sc);

        System.out.print("Pengarang      : ");
        pengarang = sc.nextLine();
        System.out.print("Penerbit       : ");
        penerbit = sc.nextLine();
        System.out.print("Kategori Buku  : ");
        kategoriBuku = sc.nextLine();
        System.out.print("Stok           : ");
        stok = sc.nextInt();
        sc.nextLine();
    }

    void tampilBuku() {
        tampilDasar();
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Penerbit       : " + penerbit);
        System.out.println("Kategori Buku  : " + kategoriBuku);
        System.out.println("Stok           : " + stok);
    }
}

class Novel extends Koleksi {
    private String penulis;
    private String kategoriNovel;
    private String statusPeminjaman;

    void inputNovel(Scanner sc) {
        inputDasar(sc);
        System.out.print("Penulis            : ");
        penulis = sc.nextLine();
        System.out.print("Kategori Novel     : ");
        kategoriNovel = sc.nextLine();
        System.out.print("Status Peminjaman  : ");
        statusPeminjaman = sc.nextLine();
    }

    void tampilNovel() {
        tampilDasar();
        System.out.println("Penulis            : " + penulis);
        System.out.println("Kategori Novel     : " + kategoriNovel);
        System.out.println("Status Peminjaman  : " + statusPeminjaman);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Buku buku = new Buku();
        Novel novel = new Novel();
        System.out.println("===== INPUT DATA BUKU =====");
        buku.inputBuku(sc);
        System.out.println("\n===== INPUT DATA NOVEL =====");
        novel.inputNovel(sc);
        System.out.println("\n===== DATA BUKU =====");
        buku.tampilBuku();
        System.out.println("\n===== DATA NOVEL =====");
        novel.tampilNovel();

        sc.close();
    }
}
