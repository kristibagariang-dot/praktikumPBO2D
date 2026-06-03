import java.util.Scanner;

public class Mahasiswaa {

    // Atribut
    String nim;
    String nama;
    double nilaiAfektif;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiSikap;
    double nilaiUAS;

    // Constructor
    public Mahasiswaa(String nim, String nama, double nilaiAfektif,
                     double nilaiTugas, double nilaiUTS,
                     double nilaiSikap, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAfektif = nilaiAfektif;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiSikap = nilaiSikap;
        this.nilaiUAS = nilaiUAS;
    }

    // Hitung Nilai Akhir
    public double hitungNilaiAkhir() {
        return (nilaiAfektif * 0.10)
                + (nilaiTugas * 0.20)
                + (nilaiUTS * 0.25)
                + (nilaiSikap * 0.10)
                + (nilaiUAS * 0.35);
    }

    // Nilai Huruf
    public String getNilaiHuruf() {
        double na = hitungNilaiAkhir();

        if (na >= 85)
            return "A";
        else if (na >= 75)
            return "B";
        else if (na >= 65)
            return "C";
        else if (na >= 55)
            return "D";
        else
            return "E";
    }

    // Status Kelulusan
    public String getStatus() {
        return hitungNilaiAkhir() >= 60 ? "Lulus" : "Tidak Lulus";
    }

    // Tampilkan Data
    public void tampilData() {
        System.out.println("==========================================");
        System.out.println("Data Mahasiswa");
        System.out.println("==========================================");

        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Afektif : " + (int) nilaiAfektif);
        System.out.println("Nilai Tugas   : " + (int) nilaiTugas);
        System.out.println("Nilai UTS     : " + (int) nilaiUTS);
        System.out.println("Nilai Sikap   : " + (int) nilaiSikap);
        System.out.println("Nilai UAS     : " + (int) nilaiUAS);
        System.out.printf("Nilai Akhir   : %.2f%n", hitungNilaiAkhir());
        System.out.println("Nilai Huruf   : " + getNilaiHuruf());
        System.out.println("Status        : " + getStatus());
    }

    public static void main(String[] args) {

        // ===== Pengecekan Inputan Manual =====
        System.out.println("==== Pengecekan Inputan Manual ====");

        Mahasiswaa mhs1 = new Mahasiswaa(
                "21506321100093",
                "Moh rama alan",
                80, 95, 80, 90, 95
        );

        mhs1.tampilData();

        System.out.println();

        // ===== Pengecekan Inputan User =====
        System.out.println("==== Pengecekan Inputan User ====");

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Nilai Afektif: ");
        double afektif = sc.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();

        System.out.print("Masukkan Nilai Sikap: ");
        double sikap = sc.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        Mahasiswaa mhs2 = new Mahasiswaa(
                nim, nama, afektif, tugas, uts, sikap, uas
        );

        System.out.println();
        mhs2.tampilData();

        sc.close();
    }
}
