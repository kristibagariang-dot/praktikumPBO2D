public class Mahasiswa {

    private String nim;
    private String nama;
    private double nilai_afektif;
    private double nilai_tugas;
    private double nilai_uts;
    private double nilai_sikap;
    private double nilai_uas;

    // Konstruktor
    public Mahasiswa(String nim, String nama, double nilai_afektif,
                     double nilai_tugas, double nilai_uts,
                     double nilai_sikap, double nilai_uas) {

        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }

    // Method hitung nilai akhir
    public double nilaiAkhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.20);
    }

    // Method konversi nilai
    public char konversiNilai(double na) {
        if (na >= 80) {
            return 'A';
        } else if (na >= 70) {
            return 'B';
        } else if (na >= 65) {
            return 'C';
        } else if (na >= 55) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Method cek kelulusan
    public boolean isLulus(char nilaiHuruf) {
        return nilaiHuruf == 'A' ||
               nilaiHuruf == 'B' ||
               nilaiHuruf == 'C';
    }

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa(
            "230631100096",
            "Suci Amalia Mayardani",
            80,
            95,
            60,
            90,
            95
        );

        double na = mhs.nilaiAkhir();
        char huruf = mhs.konversiNilai(na);
        boolean lulus = mhs.isLulus(huruf);

        System.out.println("Nama        : " + mhs.nama);
        System.out.println("NIM         : " + mhs.nim);
        System.out.println("Nilai Akhir : " + na);
        System.out.println("Nilai Huruf : " + huruf);
        System.out.println("Keterangan  : " +
                (lulus ? "LULUS" : "TIDAK LULUS"));
    }
}
