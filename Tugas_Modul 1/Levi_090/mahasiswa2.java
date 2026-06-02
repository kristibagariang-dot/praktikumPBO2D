import java.util.Scanner;

public class mahasiswa2 {
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_uas;
    double nilai_sikap;

    public mahasiswa2(String nim, String nama, double nilai_afektif, double nilai_tugas,
                      double nilai_uts, double nilai_sikap, double nilai_uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }

    public double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.30);
    }

    public String konv_nilai() {
        double na = nilai_akhir();

        if (na >= 80) {
            return "A";
        } else if (na >= 75) {
            return "B+";
        } else if (na >= 70) {
            return "B";
        } else if (na >= 65) {
            return "C+";
        } else if (na >= 60) {
            return "C";
        } else if (na >= 55) {
            return "D+";
        } else if (na >= 30) {
            return "D";
        } else {
            return "E";
        }
    }

    public boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") || huruf.equals("B+") || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C");
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan NIM            : ");
        String nim = Input.nextLine();

        System.out.print("Masukkan Nama           : ");
        String nama = Input.nextLine();

        System.out.print("Masukkan Nilai Afektif  : ");
        double afektif = Input.nextDouble();

        System.out.print("Masukkan Nilai Tugas    : ");
        double tugas = Input.nextDouble();

        System.out.print("Masukkan Nilai UTS      : ");
        double uts = Input.nextDouble();

        System.out.print("Masukkan Nilai Sikap    : ");
        double sikap = Input.nextDouble();

        System.out.print("Masukkan Nilai UAS      : ");
        double uas = Input.nextDouble();

        mahasiswa2 mhs = new mahasiswa2(nim, nama, afektif, tugas, uts, sikap, uas);

        System.out.println("\n===== HASIL =====");
        System.out.println("NIM           : " + mhs.nim);
        System.out.println("Nama          : " + mhs.nama);
        System.out.println("Nilai Akhir   : " + mhs.nilai_akhir());
        System.out.println("Nilai Huruf   : " + mhs.konv_nilai());
        System.out.println("Keterangan    : " + (mhs.isLulus() ? "LULUS" : "TIDAK LULUS"));

        Input.close();
    }
}
