class ItemPerpustakaan {
    protected String judul;
    protected int tahunTerbit;

    // constructor kosong
    ItemPerpustakaan(){}

    // constructor berparameter
    ItemPerpustakaan(String judul, int tahunTerbit){
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString(){
        return "Judul : " + judul +
               "\nTahun Terbit : " + tahunTerbit;
    }
}

class Buku extends ItemPerpustakaan{
    private String pengarang;
    private String penerbit;
    private String kategori;
    private int stok;

    // constructor kosong
    Buku(){}

    // constructor berparameter
    Buku(String judul, int tahunTerbit, String pengarang,
         String penerbit, String kategori, int stok){

        super(judul,tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String toString(){
        return super.toString() +
               "\nPengarang : " + pengarang +
               "\nPenerbit : " + penerbit +
               "\nKategori : " + kategori +
               "\nStok : " + stok;
    }
}

class Novel extends ItemPerpustakaan{
    private String penulis;
    private String kategori;
    private String status;

    // constructor kosong
    Novel(){}

    // constructor berparameter
    Novel(String judul, int tahunTerbit,
          String penulis, String kategori, String status){

        super(judul,tahunTerbit);
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

public class PerpustakaanA {
    public static void main(String[] args) {

        Buku b1 = new Buku("Algoritma",2020,"Andi",
                "Informatika","Buku Teknik",10);

        Novel n1 = new Novel("Cinta di Senja Hari",2019,
                "Rudi","Novel Romantis","Dipinjam");

        System.out.println("DATA BUKU");
        System.out.println(b1.toString());

        System.out.println("\nDATA NOVEL");
        System.out.println(n1.toString());
    }
}
