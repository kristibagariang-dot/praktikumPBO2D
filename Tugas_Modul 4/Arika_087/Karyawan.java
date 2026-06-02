import java.util.Scanner;

// abstract class (abstraction)
abstract class Karyawan {
    String nik, nama;
    int hadir, gaji;

    Karyawan(String nik, String nama, int hadir, int gaji) {
        this.nik = nik;
        this.nama = nama;
        this.hadir = hadir;
        this.gaji = gaji;
    }

    // abstract method
    abstract int hitungGaji();

    void tampil() {
        System.out.println(nik + " - " + nama);
    }
}

// final class (tidak bisa diwariskan lagi)
final class Kontrak extends Karyawan {
    Kontrak(String nik, String nama, int hadir, int gaji) {
        super(nik, nama, hadir, gaji);
    }

    int hitungGaji() {
        return gaji + (15000 * hadir);
    }

    void tampil() {
        super.tampil();
        System.out.println("Kontrak | Gaji: " + hitungGaji());
    }
}

// final class
final class Tetap extends Karyawan {
    Tetap(String nik, String nama, int hadir, int gaji) {
        super(nik, nama, hadir, gaji);
    }

    int hitungGaji() {
        return gaji + 630000 + (15000 * hadir);
    }

    void tampil() {
        super.tampil();
        System.out.println("Tetap | Gaji: " + hitungGaji());
    }
}

// main
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("1.Kontrak 2.Tetap: ");
        int p = s.nextInt(); s.nextLine();

        System.out.print("NIK: "); String nik = s.nextLine();
        System.out.print("Nama: "); String nama = s.nextLine();
        System.out.print("Hadir: "); int h = s.nextInt();
        System.out.print("Gaji: "); int g = s.nextInt();

        Karyawan k;

        if (p == 1) {
            k = new Kontrak(nik, nama, h, g);
        } else {
            k = new Tetap(nik, nama, h, g);
        }

        System.out.println("\n=== DATA ===");
        k.tampil();
    }
  }
