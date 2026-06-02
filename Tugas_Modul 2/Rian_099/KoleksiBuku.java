import java.util.Scanner;

class KoleksiBuku {
    String judul;
    int tahunTerbit;

    public KoleksiBuku() {
        judul = "Tidak diketahui";
        tahunTerbit = 0;
    }

    public KoleksiBuku(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String info() {
        return "Judul : " + judul + "\nTahun Terbit : " + tahunTerbit;
    }
}

class Buku extends KoleksiBuku {
    String pengarang;
    String penerbit;
    String kategori;
    int stok;

    public Buku(String judul, int tahunTerbit, String pengarang, String penerbit, String kategori, int stok) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String info() {
        return super.info() +
                "\nPengarang : " + pengarang +
                "\nPenerbit : " + penerbit +
                "\nKategori : " + kategori +
                "\nStok : " + stok;
    }
}

class Novel extends KoleksiBuku {
    String penulis;
    String kategoriNovel;
    String statusPinjam;

    public Novel(String judul, int tahunTerbit, String penulis, String kategoriNovel, String statusPinjam) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.statusPinjam = statusPinjam;
    }

    public String info() {
        return super.info() +
                "\nPenulis : " + penulis +
                "\nKategori Novel : " + kategoriNovel +
                "\nStatus Pinjam : " + statusPinjam;
    }
}

class NovelCek extends Novel {

    public NovelCek(String judul, int tahunTerbit, String penulis, String kategoriNovel, String statusPinjam) {
        super(judul, tahunTerbit, penulis, kategoriNovel, statusPinjam);
    }

    public void cekNovel(int batasTahun) {
        if (tahunTerbit < batasTahun) {
            System.out.println("Status Novel : Novel Lama");
        } else {
            System.out.println("Status Novel : Novel Baru");
        }
    }
}

public class Perpustakaan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Buku b1 = new Buku("Pemrograman Java", 2016, "Rian", "Informatika", "pendidikan", 12);

        NovelCek n1 = new NovelCek("Cinta di Senja Hari", 2018, "iraa", "Romantis", "Dipinjam");

        System.out.println("=== DATA BUKU ===");
        System.out.println(b1.info());

        System.out.println("\n=== DATA NOVEL ===");
        System.out.println(n1.info());

        System.out.print("\nMasukkan batas tahun novel: ");
        int batas = input.nextInt();

        n1.cekNovel(batas);
    }
}
