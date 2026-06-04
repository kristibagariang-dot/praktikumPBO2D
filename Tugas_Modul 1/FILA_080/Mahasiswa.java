import java.util.Scanner;

public class Mahasiswa {

    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_uas;
    double nilai_sikap;

    public Mahasiswa(String nim,
                     String nama,
                     double nilai_afektif,
                     double nilai_tugas,
                     double nilai_uts,
                     double nilai_sikap,
                     double nilai_uas) {

        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }

    public double nilai_akhir() {
        double NA = (nilai_afektif * 0.15)
                  + (nilai_tugas * 0.25)
                  + (nilai_uts * 0.30)
                  + (nilai_sikap * 0.10)
                  + (nilai_uas * 0.30);

        return NA;
    }

    public String konv_nilai() {
        double NA = nilai_akhir();

        if (NA >= 80) {
            return "A";
        } else if (NA >= 60) {
            return "C";
        } else if (NA >= 55) {
            return "D+";
        } else if (NA >= 30) {
            return "D";
        } else {
            return "E";
        }
    }

    public boolean isLulus() {
        String huruf = konv_nilai();

        return huruf.equals("A")
                || huruf.equals("B+")
                || huruf.equals("B")
                || huruf.equals("C+")
                || huruf.equals("C");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai Afektif : ");
        double afektif = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai Sikap : ");
        double sikap = input.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        double uas = input.nextDouble();

        Mahasiswa mhs1 = new Mahasiswa(
                nim, nama, afektif,
                tugas, uts, sikap, uas);

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM          : " + mhs1.nim);
        System.out.println("Nama         : " + mhs1.nama);
        System.out.println("Nilai Akhir  : " + mhs1.nilai_akhir());
        System.out.println("Nilai Huruf  : " + mhs1.konv_nilai());
        System.out.println("Lulus?       : " + mhs1.isLulus());

        input.close();
    }
}