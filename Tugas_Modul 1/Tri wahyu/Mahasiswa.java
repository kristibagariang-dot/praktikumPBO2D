import java.util.Scanner;

public class Mahasiswa {

    private String nim;
    private String nama;
    private int nilai_afektif;
    private int nilai_tugas;
    private int nilai_uts;
    private int nilai_sikap;
    private int nilai_uas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, int nilai_afektif,
                     int nilai_tugas, int nilai_uts,
                     int nilai_sikap, int nilai_uas) {

        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }

    public double nilai_akhir() {
        return (nilai_afektif * 0.15)
                + (nilai_tugas * 0.25)
                + (nilai_uts * 0.30)
                + (nilai_sikap * 0.10)
                + (nilai_uas * 0.20);
    }

    public char konv_nilai() {
        double na = nilai_akhir();

        if (na >= 80)
            return 'A';
        else if (na >= 75)
            return 'B';
        else if (na >= 70)
            return 'B';
        else if (na >= 65)
            return 'C';
        else if (na >= 60)
            return 'C';
        else if (na >= 55)
            return 'D';
        else if (na >= 30)
            return 'D';
        else
            return 'E';
    }

    public String isLulus() {
        char nh = konv_nilai();

        if (nh == 'A' || nh == 'B' || nh == 'C') {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public void tampilkanData() {
        System.out.println("====================================");
        System.out.println("         Data Mahasiswa");
        System.out.println("====================================");
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Afektif : " + nilai_afektif);
        System.out.println("Nilai Tugas   : " + nilai_tugas);
        System.out.println("Nilai UTS     : " + nilai_uts);
        System.out.println("Nilai Sikap   : " + nilai_sikap);
        System.out.println("Nilai UAS     : " + nilai_uas);
        System.out.printf("Nilai Akhir   : %.2f\n", nilai_akhir());
        System.out.println("Nilai Huruf   : " + konv_nilai());
        System.out.println("Status        : " + isLulus());
        System.out.println("====================================");
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai_afektif(int nilai_afektif) {
        this.nilai_afektif = nilai_afektif;
    }

    public void setNilai_tugas(int nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    public void setNilai_uts(int nilai_uts) {
        this.nilai_uts = nilai_uts;
    }

    public void setNilai_sikap(int nilai_sikap) {
        this.nilai_sikap = nilai_sikap;
    }

    public void setNilai_uas(int nilai_uas) {
        this.nilai_uas = nilai_uas;
    }

    public static void main(String[] args) {

       Mahasiswa mhsManual = new Mahasiswa(
            "250631100099",
            "Tri wahyu fajar malik",
            80,
            95,
            80,
            90,
            95
    );

    System.out.println("\n=== Pengecekan Inputan Manual ===");
    mhsManual.tampilkanData();

        Scanner input = new Scanner(System.in);
        Mahasiswa mhsUser = new Mahasiswa();

        System.out.println("\n=== Pengecekan Inputan User ===");

        System.out.print("Masukkan NIM : ");
        mhsUser.setNim(input.nextLine());

        System.out.print("Masukkan Nama : ");
        mhsUser.setNama(input.nextLine());

        System.out.print("Masukkan Nilai Afektif : ");
        mhsUser.setNilai_afektif(input.nextInt());

        System.out.print("Masukkan Nilai Tugas : ");
        mhsUser.setNilai_tugas(input.nextInt());

        System.out.print("Masukkan Nilai UTS : ");
        mhsUser.setNilai_uts(input.nextInt());

        System.out.print("Masukkan Nilai Sikap : ");
        mhsUser.setNilai_sikap(input.nextInt());

        System.out.print("Masukkan Nilai UAS : ");
        mhsUser.setNilai_uas(input.nextInt());

        System.out.println();
        mhsUser.tampilkanData();

        input.close();
    }
}
