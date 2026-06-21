class Koleksi {
    String judul;
    int tahunTerbit;

    public Koleksi() {
    }

    public Koleksi(String judul) {
        this.judul = judul;
    }

    public Koleksi(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
}

class Novel extends Koleksi {

    String penulis;

    public Novel() {
        super();
    }

    public Novel(String judul) {
        super(judul);
    }

    public Novel(String judul, int tahunTerbit, String penulis) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
    }

    void tampilData() {
        System.out.println("Judul : " + judul);
        System.out.println("Tahun : " + tahunTerbit);
        System.out.println("Penulis : " + penulis);
    }
}

public class Main {
    public static void main(String[] args) {

        Novel n = new Novel(
                "Laskar Pelangi",
                2005,
                "Andrea Hirata");

        n.tampilData();
    }
}
