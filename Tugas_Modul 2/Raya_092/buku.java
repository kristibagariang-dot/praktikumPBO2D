import java.util.Scanner;

// ================= SUPERCLASS =================
class Koleksi {
    protected String judul;
    protected int tahunTerbit;

    // Constructor kosong
    public Koleksi() {

    }

    // Constructor parameter
    public Koleksi(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilInfo() {
        System.out.println("Judul          : " + judul);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
    }
}

// ================= CLASS BUKU =================
class Buku extends Koleksi {
    private String pengarang;
    private String penerbit;
    private String kategori;
    private int stok;

    // Constructor kosong
    public Buku() {

    }

    // Constructor parameter
    public Buku(String judul, String pengarang, String penerbit,
                int tahunTerbit, String kategori, int stok) {

        super(judul, tahunTerbit);

        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Penerbit       : " + penerbit);
        System.out.println("Kategori Buku  : " + kategori);
        System.out.println("Stok Buku      : " + stok);
    }
}

// ================= CLASS NOVEL =================
class Novel extends Koleksi {
    protected String penulis;
    protected String kategoriNovel;
    protected boolean statusPinjam;

    // Constructor kosong
    public Novel() {

    }

    // Constructor parameter
    public Novel(String judul, String penulis, int tahunTerbit,
                 String kategoriNovel, boolean statusPinjam) {

        super(judul, tahunTerbit);

        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.statusPinjam = statusPinjam;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Penulis        : " + penulis);
        System.out.println("Kategori Novel : " + kategoriNovel);
        System.out.println("Status Pinjam  : " + statusPinjam);
    }
}

// ================= NOVEL LAMA =================
class NovelLama extends Novel {

    public NovelLama(String judul, String penulis, int tahunTerbit,
                     String kategoriNovel, boolean statusPinjam) {

        super(judul, penulis, tahunTerbit, kategoriNovel, statusPinjam);
    }

    public void kategoriUsiaNovel() {
        System.out.println("Kategori : Novel Lama");
    }
}

// ================= NOVEL BARU =================
class NovelBaru extends Novel {

    public NovelBaru(String judul, String penulis, int tahunTerbit,
                     String kategoriNovel, boolean statusPinjam) {

        super(judul, penulis, tahunTerbit, kategoriNovel, statusPinjam);
    }

    public void kategoriUsiaNovel() {
        System.out.println("Kategori : Novel Baru");
    }
}

// ================= MAIN CLASS =================
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ================= INPUT BUKU =================
        System.out.println("=== INPUT DATA BUKU ===");

        System.out.print("Judul Buku : ");
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

        Buku buku = new Buku(
                judulBuku,
                pengarang,
                penerbit,
                tahunBuku,
                kategoriBuku,
                stok
        );

        // ================= INPUT NOVEL =================
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

        System.out.print("Status Dipinjam (true/false) : ");
        boolean status = input.nextBoolean();

        // ================= CEK NOVEL =================
        System.out.print("\nMasukkan batas tahun novel lama : ");
        int batasTahun = input.nextInt();

        // ================= OUTPUT BUKU =================
        System.out.println("\n=== HASIL DATA BUKU ===");
        buku.tampilInfo();

        // ================= OUTPUT NOVEL =================
        System.out.println("\n=== HASIL DATA NOVEL ===");

        if (tahunNovel <= batasTahun) {

            NovelLama lama = new NovelLama(
                    judulNovel,
                    penulis,
                    tahunNovel,
                    kategoriNovel,
                    status
            );

            lama.tampilInfo();
            lama.kategoriUsiaNovel();

        } else {

            NovelBaru baru = new NovelBaru(
                    judulNovel,
                    penulis,
                    tahunNovel,
                    kategoriNovel,
                    status
            );

            baru.tampilInfo();
            baru.kategoriUsiaNovel();
        }
    }
}
