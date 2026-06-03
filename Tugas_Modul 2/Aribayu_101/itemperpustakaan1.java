import java.util.Scanner;

class ItemPerpustakaan {
    protected String judul;
    protected int tahunTerbit;

    ItemPerpustakaan(String judul, int tahunTerbit){
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString(){
        return "Judul : " + judul +
               "\nTahun Terbit : " + tahunTerbit;
    }
}

class Novel extends ItemPerpustakaan {
    protected String penulis;
    protected String kategori;
    protected String status;

    Novel(String judul, int tahunTerbit,
          String penulis, String kategori, String status){

        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategori = kategori;
        this.status = status;
    }

    public String toString(){
        return super.toString() +
               "\nPenulis : " + penulis +
               "\nKategori : " + kategori +
               "\nStatus : " + status;
    }
}

class NovelBaru extends Novel {

    NovelBaru(String judul, int tahunTerbit,
              String penulis, String kategori, String status){
        super(judul, tahunTerbit, penulis, kategori, status);
    }

    public String toString(){
        return super.toString() +
               "\nJenis Novel : Novel Baru";
    }
}

class NovelLama extends Novel {

    NovelLama(String judul, int tahunTerbit,
              String penulis, String kategori, String status){
        super(judul, tahunTerbit, penulis, kategori, status);
    }

    public String toString(){
        return super.toString() +
               "\nJenis Novel : Novel Lama";
    }
}

public class Perpustakaan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Judul Novel : ");
        String judul = input.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahun = input.nextInt();
        input.nextLine();

        System.out.print("Penulis : ");
        String penulis = input.nextLine();

        System.out.print("Kategori : ");
        String kategori = input.nextLine();

        System.out.print("Status Peminjaman : ");
        String status = input.nextLine();

        System.out.print("Masukkan batas tahun novel baru : ");
        int batas = input.nextInt();

        Novel novel;

        if(tahun >= batas){
            novel = new NovelBaru(judul,tahun,penulis,kategori,status);
        }else{
            novel = new NovelLama(judul,tahun,penulis,kategori,status);
        }

        System.out.println("\nHASIL DATA NOVEL");
        System.out.println(novel.toString());
    }
}
