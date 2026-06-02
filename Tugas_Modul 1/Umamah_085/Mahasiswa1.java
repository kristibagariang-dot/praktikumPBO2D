/*@author Taufiq*/
import java.util.Scanner;

public class Mahasiswa {

    private String nim, nama;
    private double nilaiAfektif, nilaiTugas, nilaiUTS, nilaiSikap, nilaiUAS;

    public Mahasiswa() {
    }

    public void setData(String nim, String nama,
                        double nilaiAfektif,
                        double nilaiTugas,
                        double nilaiUTS,
                        double nilaiSikap,
                        double nilaiUAS) {

        this.nim = nim;
        this.nama = nama;
        this.nilaiAfektif = nilaiAfektif;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiSikap = nilaiSikap;
        this.nilaiUAS = nilaiUAS;
    }

    public double nilaiAkhir() {
        return (nilaiAfektif * 0.15) +
               (nilaiTugas * 0.25) +
               (nilaiUTS * 0.30) +
               (nilaiSikap * 0.10) +
               (nilaiUAS * 0.20);
    }

    public String konvNilai() {
        double na = nilaiAkhir();

        if (na >= 80) return "A";
        else if (na >= 75) return "B+";
        else if (na >= 70) return "B";
        else if (na >= 65) return "C+";
        else if (na >= 60) return "C";
        else if (na >= 55) return "D+";
        else if (na >= 30) return "D";
        else return "E";
    }

    public boolean isLulus() {
        String huruf = konvNilai();
        return huruf.equals("A") ||
               huruf.equals("B+") ||
               huruf.equals("B") ||
               huruf.equals("C+") ||
               huruf.equals("C");
    }

    public void tampilkanData() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Akhir   : " + nilaiAkhir());
        System.out.println("Nilai Huruf   : " + konvNilai());
        System.out.println("Keterangan    : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa m2 = new Mahasiswa();

        System.out.println("=== INPUT DATA MAHASISWA ===");

        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Nilai Afektif : ");
        double afektif = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai UTS : ");
        double uts = input.nextDouble();

        System.out.print("Nilai Sikap : ");
        double sikap = input.nextDouble();

        System.out.print("Nilai UAS : ");
        double uas = input.nextDouble();

        m2.setData(nim, nama, afektif, tugas, uts, sikap, uas);

        System.out.println("\n=== DATA MAHASISWA ===");
        m2.tampilkanData();
    }
}
