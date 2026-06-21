import java.util.Scanner;

class Koleksi {
    String judul;
    int tahunTerbit;

    public Koleksi(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
}

class Novel extends Koleksi {

    String penulis;

    public Novel(String judul, int tahunTerbit,
                 String penulis) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
    }
}

class NovelBaru extends Novel {

    public NovelBaru(String judul,
                     int tahunTerbit,
                     String penulis) {
        super(judul, tahunTerbit, penulis);
    }

    void info() {
        System.out.println("Kategori : NOVEL BARU");
    }
}

class NovelLama extends Novel {

    public NovelLama(String judul,
                     int tahunTerbit,
                     String penulis) {
        super(judul, tahunTerbit, penulis);
    }

    void info() {
        System.out.println("Kategori : NOVEL LAMA");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas tahun : ");
        int batas = input.nextInt();
        input.nextLine();

        System.out.print("Judul Novel : ");
        String judul = input.nextLine();

        System.out.print("Penulis : ");
        String penulis = input.nextLine();

        System.out.print("Tahun Terbit : ");
        int tahun = input.nextInt();

        if (tahun >= batas) {

            NovelBaru nb =
                new NovelBaru(judul, tahun, penulis);

            System.out.println("\nNovel Baru");
            nb.info();

        } else {

            NovelLama nl =
                new NovelLama(judul, tahun, penulis);

            System.out.println("\nNovel Lama");
            nl.info();
        }
    }
}
