import java.util.Scanner;

class Koleksi {
    protected String judul;
    protected int tahunTerbit;
  
    // Constructor kosong
    public Koleksi(){}
    
// Constructor berparameter
    public Koleksi(String judul, int tahunTerbit){
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    void tampilDasar(){
        System.out.println("Judul          : " + judul);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
    }
}
class Buku extends Koleksi {
    private String pengarang;
    private String penerbit;
    private String kategoriBuku;
    private int stok;
    
    public Buku(){}
    public Buku(String judul, int tahunTerbit, String pengarang, String penerbit, String kategoriBuku, int stok){
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategoriBuku = kategoriBuku;
        this.stok = stok;
    }
    void tampilBuku(){
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
    public Novel(){}
    public Novel(String judul, int tahunTerbit, String penulis, String kategoriNovel, String statusPeminjaman){
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.statusPeminjaman = statusPeminjaman;
    }
    void tampilNovel(){
        tampilDasar();
        System.out.println("Penulis            : " + penulis);
        System.out.println("Kategori Novel     : " + kategoriNovel);
        System.out.println("Status Peminjaman  : " + statusPeminjaman);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        // Input Buku
        System.out.println("=== INPUT DATA BUKU ===");
        System.out.print("Judul Buku        : ");
        String judulBuku = sc.nextLine();
        System.out.print("Tahun Terbit      : ");
        int tahunBuku = sc.nextInt();
        sc.nextLine();
        System.out.print("Pengarang         : ");
        String pengarang = sc.nextLine();
        System.out.print("Penerbit          : ");
        String penerbit = sc.nextLine();
        System.out.print("Kategori Buku     : ");
        String kategoriBuku = sc.nextLine();
        System.out.print("Stok              : ");
       
        int stok = sc.nextInt();
        
        sc.nextLine();
        Buku buku = new Buku(judulBuku, tahunBuku, pengarang, penerbit, kategoriBuku, stok);
   
        // Input Novel
        System.out.println("\n=== INPUT DATA NOVEL ===");
        System.out.print("Judul Novel       : ");
        String judulNovel = sc.nextLine();
        System.out.print("Tahun Terbit      : ");
        int tahunNovel = sc.nextInt();
        sc.nextLine();
        System.out.print("Penulis           : ");
        String penulis = sc.nextLine();
        System.out.print("Kategori Novel    : ");
        String kategoriNovel = sc.nextLine();
        System.out.print("Status Peminjaman : ");
        String status = sc.nextLine();
        Novel novel = new Novel(judulNovel, tahunNovel, penulis, kategoriNovel, status);
      
        // Output
        System.out.println("\n=== DATA BUKU ===");
        buku.tampilBuku();
        System.out.println("\n=== DATA NOVEL ===");
        novel.tampilNovel();

        sc.close();
    }
}
