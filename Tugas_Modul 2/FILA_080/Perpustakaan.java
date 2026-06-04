import java.util.Scanner;


class ItemPerpustakaan {
    String judul;
    int tahunTerbit;

    
    ItemPerpustakaan(){}

   
    ItemPerpustakaan(String judul, int tahunTerbit){
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
}


 class Buku extends ItemPerpustakaan{
    String pengarang;
    String penerbit;
    String kategori;
    int stok;

   
    Buku(){}

    
    Buku(String judul, String pengarang, String penerbit, int tahunTerbit, String kategori, int stok){
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    void tampilBuku(){
        System.out.println("\nDATA BUKU");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok : " + stok);
    }
}

class Novel extends ItemPerpustakaan{
    String penulis;
    String kategori;
    String status;

    Novel(){}

    Novel(String judul, String penulis, int tahunTerbit, String kategori, String status){
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategori = kategori;
        this.status = status;
    }

    void tampilNovel(){
        System.out.println("\nDATA NOVEL");
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("Status : " + status);
    }
}


class NovelBaru extends Novel{
    NovelBaru(String judul, String penulis, int tahunTerbit, String kategori, String status){
        super(judul, penulis, tahunTerbit, kategori, status);
    }

    void info(){
        System.out.println("Ini termasuk Novel Baru");
    }
}


class NovelLama extends Novel{
    NovelLama(String judul, String penulis, int tahunTerbit, String kategori, String status){
        super(judul, penulis, tahunTerbit, kategori, status);
    }

    void info(){
        System.out.println("Ini termasuk Novel Lama");
    }
}


public class Perpustakaan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("=== INPUT DATA BUKU ===");
        System.out.print("Judul : ");
        String judulBuku = input.nextLine();

        System.out.print("Pengarang : ");
        String pengarang = input.nextLine();

        System.out.print("Penerbit : ");
        String penerbit = input.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahunBuku = input.nextInt();
        input.nextLine();

        System.out.print("Kategori Buku : ");
        String kategoriBuku = input.nextLine();

        System.out.print("Stok Buku : ");
        int stok = input.nextInt();
        input.nextLine();

        Buku buku1 = new Buku(judulBuku, pengarang, penerbit, tahunBuku, kategoriBuku, stok);


        
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


        System.out.print("\nMasukkan batas tahun novel baru : ");
        int batasTahun = input.nextInt();

        if(tahunNovel >= batasTahun){
            NovelBaru n = new NovelBaru(judulNovel, penulis, tahunNovel, kategoriNovel, status);
            buku1.tampilBuku();
            n.tampilNovel();
            n.info();
        }else{
            NovelLama n = new NovelLama(judulNovel, penulis, tahunNovel, kategoriNovel, status);
            buku1.tampilBuku();
            n.tampilNovel();
            n.info();
        }

    }
}