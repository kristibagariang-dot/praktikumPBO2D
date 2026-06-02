import java.util.Scanner;

class Koleksi {
    String judul;
    int tahunTerbit;

    void inputDasar(Scanner sc){
        System.out.print("Judul: ");
        judul = sc.nextLine();
        System.out.print("Tahun Terbit: ");
        tahunTerbit = sc.nextInt();
        sc.nextLine();
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

    void inputBuku(Scanner sc){
        inputDasar(sc);
        System.out.print("Pengarang: ");
        pengarang = sc.nextLine();
        System.out.print("Penerbit: ");
        penerbit = sc.nextLine();
        System.out.print("Kategori Buku: ");
        kategoriBuku = sc.nextLine();
        System.out.print("Stok: ");
        stok = sc.nextInt();
        sc.nextLine();
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

    void inputNovel(Scanner sc){
        inputDasar(sc);
        System.out.print("Penulis: ");
        penulis = sc.nextLine();
        System.out.print("Kategori Novel: ");
        kategoriNovel = sc.nextLine();
        System.out.print("Status Peminjaman: ");
        statusPeminjaman = sc.nextLine();
    }

    void tampilNovel(){
        tampilDasar();
        System.out.println("Penulis: " + penulis);
        System.out.println("Kategori Novel: " + kategoriNovel);
        System.out.println("Status Peminjaman: " + statusPeminjaman);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Buku buku = new Buku();
        Novel novel = new Novel();

        System.out.println("Input Data Buku");
        buku.inputBuku(sc);

        System.out.println("\nInput Data Novel");
        novel.inputNovel(sc);

        System.out.println("\nData Buku");
        buku.tampilBuku();

        System.out.println("\nData Novel");
        novel.tampilNovel();
    }
}
